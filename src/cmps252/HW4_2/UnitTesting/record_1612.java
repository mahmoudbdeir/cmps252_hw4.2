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

@Tag("47")
class Record_1612 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1612: FirstName is Francis")
	void FirstNameOfRecord1612() {
		assertEquals("Francis", customers.get(1611).getFirstName());
	}

	@Test
	@DisplayName("Record 1612: LastName is Earlywine")
	void LastNameOfRecord1612() {
		assertEquals("Earlywine", customers.get(1611).getLastName());
	}

	@Test
	@DisplayName("Record 1612: Company is Nancys Corner")
	void CompanyOfRecord1612() {
		assertEquals("Nancys Corner", customers.get(1611).getCompany());
	}

	@Test
	@DisplayName("Record 1612: Address is 142 Rancho Del Mar Shopping C")
	void AddressOfRecord1612() {
		assertEquals("142 Rancho Del Mar Shopping C", customers.get(1611).getAddress());
	}

	@Test
	@DisplayName("Record 1612: City is Aptos")
	void CityOfRecord1612() {
		assertEquals("Aptos", customers.get(1611).getCity());
	}

	@Test
	@DisplayName("Record 1612: County is Santa Cruz")
	void CountyOfRecord1612() {
		assertEquals("Santa Cruz", customers.get(1611).getCounty());
	}

	@Test
	@DisplayName("Record 1612: State is CA")
	void StateOfRecord1612() {
		assertEquals("CA", customers.get(1611).getState());
	}

	@Test
	@DisplayName("Record 1612: ZIP is 95003")
	void ZIPOfRecord1612() {
		assertEquals("95003", customers.get(1611).getZIP());
	}

	@Test
	@DisplayName("Record 1612: Phone is 831-688-2873")
	void PhoneOfRecord1612() {
		assertEquals("831-688-2873", customers.get(1611).getPhone());
	}

	@Test
	@DisplayName("Record 1612: Fax is 831-688-5078")
	void FaxOfRecord1612() {
		assertEquals("831-688-5078", customers.get(1611).getFax());
	}

	@Test
	@DisplayName("Record 1612: Email is francis@earlywine.com")
	void EmailOfRecord1612() {
		assertEquals("francis@earlywine.com", customers.get(1611).getEmail());
	}

	@Test
	@DisplayName("Record 1612: Web is http://www.francisearlywine.com")
	void WebOfRecord1612() {
		assertEquals("http://www.francisearlywine.com", customers.get(1611).getWeb());
	}
}
