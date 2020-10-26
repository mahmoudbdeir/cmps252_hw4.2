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

@Tag("24")
class Record_3953 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3953: FirstName is Frederick")
	void FirstNameOfRecord3953() {
		assertEquals("Frederick", customers.get(3952).getFirstName());
	}

	@Test
	@DisplayName("Record 3953: LastName is Kubota")
	void LastNameOfRecord3953() {
		assertEquals("Kubota", customers.get(3952).getLastName());
	}

	@Test
	@DisplayName("Record 3953: Company is Case Knowlson Mobley Burnett")
	void CompanyOfRecord3953() {
		assertEquals("Case Knowlson Mobley Burnett", customers.get(3952).getCompany());
	}

	@Test
	@DisplayName("Record 3953: Address is 350 5th Ave  #-2828")
	void AddressOfRecord3953() {
		assertEquals("350 5th Ave  #-2828", customers.get(3952).getAddress());
	}

	@Test
	@DisplayName("Record 3953: City is New York")
	void CityOfRecord3953() {
		assertEquals("New York", customers.get(3952).getCity());
	}

	@Test
	@DisplayName("Record 3953: County is New York")
	void CountyOfRecord3953() {
		assertEquals("New York", customers.get(3952).getCounty());
	}

	@Test
	@DisplayName("Record 3953: State is NY")
	void StateOfRecord3953() {
		assertEquals("NY", customers.get(3952).getState());
	}

	@Test
	@DisplayName("Record 3953: ZIP is 10118")
	void ZIPOfRecord3953() {
		assertEquals("10118", customers.get(3952).getZIP());
	}

	@Test
	@DisplayName("Record 3953: Phone is 212-629-0708")
	void PhoneOfRecord3953() {
		assertEquals("212-629-0708", customers.get(3952).getPhone());
	}

	@Test
	@DisplayName("Record 3953: Fax is 212-629-4639")
	void FaxOfRecord3953() {
		assertEquals("212-629-4639", customers.get(3952).getFax());
	}

	@Test
	@DisplayName("Record 3953: Email is frederick@kubota.com")
	void EmailOfRecord3953() {
		assertEquals("frederick@kubota.com", customers.get(3952).getEmail());
	}

	@Test
	@DisplayName("Record 3953: Web is http://www.frederickkubota.com")
	void WebOfRecord3953() {
		assertEquals("http://www.frederickkubota.com", customers.get(3952).getWeb());
	}
}
