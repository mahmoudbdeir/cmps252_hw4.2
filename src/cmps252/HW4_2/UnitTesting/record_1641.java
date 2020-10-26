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
class Record_1641 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1641: FirstName is Elizabeth")
	void FirstNameOfRecord1641() {
		assertEquals("Elizabeth", customers.get(1640).getFirstName());
	}

	@Test
	@DisplayName("Record 1641: LastName is Parco")
	void LastNameOfRecord1641() {
		assertEquals("Parco", customers.get(1640).getLastName());
	}

	@Test
	@DisplayName("Record 1641: Company is Mueller, Michael J Esq")
	void CompanyOfRecord1641() {
		assertEquals("Mueller, Michael J Esq", customers.get(1640).getCompany());
	}

	@Test
	@DisplayName("Record 1641: Address is 2800 Canton Hwy  #-m1600")
	void AddressOfRecord1641() {
		assertEquals("2800 Canton Hwy  #-m1600", customers.get(1640).getAddress());
	}

	@Test
	@DisplayName("Record 1641: City is Marietta")
	void CityOfRecord1641() {
		assertEquals("Marietta", customers.get(1640).getCity());
	}

	@Test
	@DisplayName("Record 1641: County is Cobb")
	void CountyOfRecord1641() {
		assertEquals("Cobb", customers.get(1640).getCounty());
	}

	@Test
	@DisplayName("Record 1641: State is GA")
	void StateOfRecord1641() {
		assertEquals("GA", customers.get(1640).getState());
	}

	@Test
	@DisplayName("Record 1641: ZIP is 30066")
	void ZIPOfRecord1641() {
		assertEquals("30066", customers.get(1640).getZIP());
	}

	@Test
	@DisplayName("Record 1641: Phone is 770-919-9168")
	void PhoneOfRecord1641() {
		assertEquals("770-919-9168", customers.get(1640).getPhone());
	}

	@Test
	@DisplayName("Record 1641: Fax is 770-919-2586")
	void FaxOfRecord1641() {
		assertEquals("770-919-2586", customers.get(1640).getFax());
	}

	@Test
	@DisplayName("Record 1641: Email is elizabeth@parco.com")
	void EmailOfRecord1641() {
		assertEquals("elizabeth@parco.com", customers.get(1640).getEmail());
	}

	@Test
	@DisplayName("Record 1641: Web is http://www.elizabethparco.com")
	void WebOfRecord1641() {
		assertEquals("http://www.elizabethparco.com", customers.get(1640).getWeb());
	}
}
