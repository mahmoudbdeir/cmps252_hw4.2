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

@Tag("43")
class Record_1011 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1011: FirstName is Kenny")
	void FirstNameOfRecord1011() {
		assertEquals("Kenny", customers.get(1010).getFirstName());
	}

	@Test
	@DisplayName("Record 1011: LastName is Janney")
	void LastNameOfRecord1011() {
		assertEquals("Janney", customers.get(1010).getLastName());
	}

	@Test
	@DisplayName("Record 1011: Company is Mechanics Savings & Loan Assn")
	void CompanyOfRecord1011() {
		assertEquals("Mechanics Savings & Loan Assn", customers.get(1010).getCompany());
	}

	@Test
	@DisplayName("Record 1011: Address is Hwy 80e E")
	void AddressOfRecord1011() {
		assertEquals("Hwy 80e E", customers.get(1010).getAddress());
	}

	@Test
	@DisplayName("Record 1011: City is Pearl")
	void CityOfRecord1011() {
		assertEquals("Pearl", customers.get(1010).getCity());
	}

	@Test
	@DisplayName("Record 1011: County is Rankin")
	void CountyOfRecord1011() {
		assertEquals("Rankin", customers.get(1010).getCounty());
	}

	@Test
	@DisplayName("Record 1011: State is MS")
	void StateOfRecord1011() {
		assertEquals("MS", customers.get(1010).getState());
	}

	@Test
	@DisplayName("Record 1011: ZIP is 39208")
	void ZIPOfRecord1011() {
		assertEquals("39208", customers.get(1010).getZIP());
	}

	@Test
	@DisplayName("Record 1011: Phone is 601-939-1180")
	void PhoneOfRecord1011() {
		assertEquals("601-939-1180", customers.get(1010).getPhone());
	}

	@Test
	@DisplayName("Record 1011: Fax is 601-939-9808")
	void FaxOfRecord1011() {
		assertEquals("601-939-9808", customers.get(1010).getFax());
	}

	@Test
	@DisplayName("Record 1011: Email is kenny@janney.com")
	void EmailOfRecord1011() {
		assertEquals("kenny@janney.com", customers.get(1010).getEmail());
	}

	@Test
	@DisplayName("Record 1011: Web is http://www.kennyjanney.com")
	void WebOfRecord1011() {
		assertEquals("http://www.kennyjanney.com", customers.get(1010).getWeb());
	}
}
