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

@Tag("11")
class Record_1346 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1346: FirstName is Mary")
	void FirstNameOfRecord1346() {
		assertEquals("Mary", customers.get(1345).getFirstName());
	}

	@Test
	@DisplayName("Record 1346: LastName is Nguy")
	void LastNameOfRecord1346() {
		assertEquals("Nguy", customers.get(1345).getLastName());
	}

	@Test
	@DisplayName("Record 1346: Company is Independent Center For Ins")
	void CompanyOfRecord1346() {
		assertEquals("Independent Center For Ins", customers.get(1345).getCompany());
	}

	@Test
	@DisplayName("Record 1346: Address is 47690 Westinghouse Dr")
	void AddressOfRecord1346() {
		assertEquals("47690 Westinghouse Dr", customers.get(1345).getAddress());
	}

	@Test
	@DisplayName("Record 1346: City is Fremont")
	void CityOfRecord1346() {
		assertEquals("Fremont", customers.get(1345).getCity());
	}

	@Test
	@DisplayName("Record 1346: County is Alameda")
	void CountyOfRecord1346() {
		assertEquals("Alameda", customers.get(1345).getCounty());
	}

	@Test
	@DisplayName("Record 1346: State is CA")
	void StateOfRecord1346() {
		assertEquals("CA", customers.get(1345).getState());
	}

	@Test
	@DisplayName("Record 1346: ZIP is 94539")
	void ZIPOfRecord1346() {
		assertEquals("94539", customers.get(1345).getZIP());
	}

	@Test
	@DisplayName("Record 1346: Phone is 510-490-2440")
	void PhoneOfRecord1346() {
		assertEquals("510-490-2440", customers.get(1345).getPhone());
	}

	@Test
	@DisplayName("Record 1346: Fax is 510-490-2758")
	void FaxOfRecord1346() {
		assertEquals("510-490-2758", customers.get(1345).getFax());
	}

	@Test
	@DisplayName("Record 1346: Email is mary@nguy.com")
	void EmailOfRecord1346() {
		assertEquals("mary@nguy.com", customers.get(1345).getEmail());
	}

	@Test
	@DisplayName("Record 1346: Web is http://www.marynguy.com")
	void WebOfRecord1346() {
		assertEquals("http://www.marynguy.com", customers.get(1345).getWeb());
	}
}
