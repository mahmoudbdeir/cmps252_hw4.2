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
class Record_1498 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1498: FirstName is Candice")
	void FirstNameOfRecord1498() {
		assertEquals("Candice", customers.get(1497).getFirstName());
	}

	@Test
	@DisplayName("Record 1498: LastName is Mand")
	void LastNameOfRecord1498() {
		assertEquals("Mand", customers.get(1497).getLastName());
	}

	@Test
	@DisplayName("Record 1498: Company is Travelers Inn")
	void CompanyOfRecord1498() {
		assertEquals("Travelers Inn", customers.get(1497).getCompany());
	}

	@Test
	@DisplayName("Record 1498: Address is 1201 Vine Ave Ne")
	void AddressOfRecord1498() {
		assertEquals("1201 Vine Ave Ne", customers.get(1497).getAddress());
	}

	@Test
	@DisplayName("Record 1498: City is Warren")
	void CityOfRecord1498() {
		assertEquals("Warren", customers.get(1497).getCity());
	}

	@Test
	@DisplayName("Record 1498: County is Trumbull")
	void CountyOfRecord1498() {
		assertEquals("Trumbull", customers.get(1497).getCounty());
	}

	@Test
	@DisplayName("Record 1498: State is OH")
	void StateOfRecord1498() {
		assertEquals("OH", customers.get(1497).getState());
	}

	@Test
	@DisplayName("Record 1498: ZIP is 44483")
	void ZIPOfRecord1498() {
		assertEquals("44483", customers.get(1497).getZIP());
	}

	@Test
	@DisplayName("Record 1498: Phone is 330-399-4506")
	void PhoneOfRecord1498() {
		assertEquals("330-399-4506", customers.get(1497).getPhone());
	}

	@Test
	@DisplayName("Record 1498: Fax is 330-399-5479")
	void FaxOfRecord1498() {
		assertEquals("330-399-5479", customers.get(1497).getFax());
	}

	@Test
	@DisplayName("Record 1498: Email is candice@mand.com")
	void EmailOfRecord1498() {
		assertEquals("candice@mand.com", customers.get(1497).getEmail());
	}

	@Test
	@DisplayName("Record 1498: Web is http://www.candicemand.com")
	void WebOfRecord1498() {
		assertEquals("http://www.candicemand.com", customers.get(1497).getWeb());
	}
}
