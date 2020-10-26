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

@Tag("16")
class Record_2565 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2565: FirstName is Sadie")
	void FirstNameOfRecord2565() {
		assertEquals("Sadie", customers.get(2564).getFirstName());
	}

	@Test
	@DisplayName("Record 2565: LastName is Pulford")
	void LastNameOfRecord2565() {
		assertEquals("Pulford", customers.get(2564).getLastName());
	}

	@Test
	@DisplayName("Record 2565: Company is Diamond Head Sprinkler Inc")
	void CompanyOfRecord2565() {
		assertEquals("Diamond Head Sprinkler Inc", customers.get(2564).getCompany());
	}

	@Test
	@DisplayName("Record 2565: Address is 3131 Executive Pky")
	void AddressOfRecord2565() {
		assertEquals("3131 Executive Pky", customers.get(2564).getAddress());
	}

	@Test
	@DisplayName("Record 2565: City is Toledo")
	void CityOfRecord2565() {
		assertEquals("Toledo", customers.get(2564).getCity());
	}

	@Test
	@DisplayName("Record 2565: County is Lucas")
	void CountyOfRecord2565() {
		assertEquals("Lucas", customers.get(2564).getCounty());
	}

	@Test
	@DisplayName("Record 2565: State is OH")
	void StateOfRecord2565() {
		assertEquals("OH", customers.get(2564).getState());
	}

	@Test
	@DisplayName("Record 2565: ZIP is 43606")
	void ZIPOfRecord2565() {
		assertEquals("43606", customers.get(2564).getZIP());
	}

	@Test
	@DisplayName("Record 2565: Phone is 419-531-7593")
	void PhoneOfRecord2565() {
		assertEquals("419-531-7593", customers.get(2564).getPhone());
	}

	@Test
	@DisplayName("Record 2565: Fax is 419-531-5371")
	void FaxOfRecord2565() {
		assertEquals("419-531-5371", customers.get(2564).getFax());
	}

	@Test
	@DisplayName("Record 2565: Email is sadie@pulford.com")
	void EmailOfRecord2565() {
		assertEquals("sadie@pulford.com", customers.get(2564).getEmail());
	}

	@Test
	@DisplayName("Record 2565: Web is http://www.sadiepulford.com")
	void WebOfRecord2565() {
		assertEquals("http://www.sadiepulford.com", customers.get(2564).getWeb());
	}
}
