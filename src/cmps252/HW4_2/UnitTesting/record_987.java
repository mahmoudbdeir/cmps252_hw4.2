package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("44")
class Record_987 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 987: FirstName is Olivia")
	void FirstNameOfRecord987() {
		assertEquals("Olivia", customers.get(986).getFirstName());
	}

	@Test
	@DisplayName("Record 987: LastName is Venetos")
	void LastNameOfRecord987() {
		assertEquals("Venetos", customers.get(986).getLastName());
	}

	@Test
	@DisplayName("Record 987: Company is Laparle, Gerard Esq")
	void CompanyOfRecord987() {
		assertEquals("Laparle, Gerard Esq", customers.get(986).getCompany());
	}

	@Test
	@DisplayName("Record 987: Address is 2243 Morena Blvd")
	void AddressOfRecord987() {
		assertEquals("2243 Morena Blvd", customers.get(986).getAddress());
	}

	@Test
	@DisplayName("Record 987: City is San Diego")
	void CityOfRecord987() {
		assertEquals("San Diego", customers.get(986).getCity());
	}

	@Test
	@DisplayName("Record 987: County is San Diego")
	void CountyOfRecord987() {
		assertEquals("San Diego", customers.get(986).getCounty());
	}

	@Test
	@DisplayName("Record 987: State is CA")
	void StateOfRecord987() {
		assertEquals("CA", customers.get(986).getState());
	}

	@Test
	@DisplayName("Record 987: ZIP is 92110")
	void ZIPOfRecord987() {
		assertEquals("92110", customers.get(986).getZIP());
	}

	@Test
	@DisplayName("Record 987: Phone is 858-276-6988")
	void PhoneOfRecord987() {
		assertEquals("858-276-6988", customers.get(986).getPhone());
	}

	@Test
	@DisplayName("Record 987: Fax is 858-276-5534")
	void FaxOfRecord987() {
		assertEquals("858-276-5534", customers.get(986).getFax());
	}

	@Test
	@DisplayName("Record 987: Email is olivia@venetos.com")
	void EmailOfRecord987() {
		assertEquals("olivia@venetos.com", customers.get(986).getEmail());
	}

	@Test
	@DisplayName("Record 987: Web is http://www.oliviavenetos.com")
	void WebOfRecord987() {
		assertEquals("http://www.oliviavenetos.com", customers.get(986).getWeb());
	}
}
