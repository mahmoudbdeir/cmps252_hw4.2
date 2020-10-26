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

@Tag("36")
class Record_2439 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2439: FirstName is Jake")
	void FirstNameOfRecord2439() {
		assertEquals("Jake", customers.get(2438).getFirstName());
	}

	@Test
	@DisplayName("Record 2439: LastName is Yerkovich")
	void LastNameOfRecord2439() {
		assertEquals("Yerkovich", customers.get(2438).getLastName());
	}

	@Test
	@DisplayName("Record 2439: Company is Chad Pratt Law Offices Of")
	void CompanyOfRecord2439() {
		assertEquals("Chad Pratt Law Offices Of", customers.get(2438).getCompany());
	}

	@Test
	@DisplayName("Record 2439: Address is 1031 Lambert St")
	void AddressOfRecord2439() {
		assertEquals("1031 Lambert St", customers.get(2438).getAddress());
	}

	@Test
	@DisplayName("Record 2439: City is Barberton")
	void CityOfRecord2439() {
		assertEquals("Barberton", customers.get(2438).getCity());
	}

	@Test
	@DisplayName("Record 2439: County is Summit")
	void CountyOfRecord2439() {
		assertEquals("Summit", customers.get(2438).getCounty());
	}

	@Test
	@DisplayName("Record 2439: State is OH")
	void StateOfRecord2439() {
		assertEquals("OH", customers.get(2438).getState());
	}

	@Test
	@DisplayName("Record 2439: ZIP is 44203")
	void ZIPOfRecord2439() {
		assertEquals("44203", customers.get(2438).getZIP());
	}

	@Test
	@DisplayName("Record 2439: Phone is 330-753-4985")
	void PhoneOfRecord2439() {
		assertEquals("330-753-4985", customers.get(2438).getPhone());
	}

	@Test
	@DisplayName("Record 2439: Fax is 330-753-2978")
	void FaxOfRecord2439() {
		assertEquals("330-753-2978", customers.get(2438).getFax());
	}

	@Test
	@DisplayName("Record 2439: Email is jake@yerkovich.com")
	void EmailOfRecord2439() {
		assertEquals("jake@yerkovich.com", customers.get(2438).getEmail());
	}

	@Test
	@DisplayName("Record 2439: Web is http://www.jakeyerkovich.com")
	void WebOfRecord2439() {
		assertEquals("http://www.jakeyerkovich.com", customers.get(2438).getWeb());
	}
}
