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

@Tag("14")
class Record_491 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 491: FirstName is Todd")
	void FirstNameOfRecord491() {
		assertEquals("Todd", customers.get(490).getFirstName());
	}

	@Test
	@DisplayName("Record 491: LastName is Malik")
	void LastNameOfRecord491() {
		assertEquals("Malik", customers.get(490).getLastName());
	}

	@Test
	@DisplayName("Record 491: Company is Michael Raffaell Constrctn Inc")
	void CompanyOfRecord491() {
		assertEquals("Michael Raffaell Constrctn Inc", customers.get(490).getCompany());
	}

	@Test
	@DisplayName("Record 491: Address is 654 Portage Tr")
	void AddressOfRecord491() {
		assertEquals("654 Portage Tr", customers.get(490).getAddress());
	}

	@Test
	@DisplayName("Record 491: City is Cuyahoga Falls")
	void CityOfRecord491() {
		assertEquals("Cuyahoga Falls", customers.get(490).getCity());
	}

	@Test
	@DisplayName("Record 491: County is Summit")
	void CountyOfRecord491() {
		assertEquals("Summit", customers.get(490).getCounty());
	}

	@Test
	@DisplayName("Record 491: State is OH")
	void StateOfRecord491() {
		assertEquals("OH", customers.get(490).getState());
	}

	@Test
	@DisplayName("Record 491: ZIP is 44221")
	void ZIPOfRecord491() {
		assertEquals("44221", customers.get(490).getZIP());
	}

	@Test
	@DisplayName("Record 491: Phone is 330-928-1527")
	void PhoneOfRecord491() {
		assertEquals("330-928-1527", customers.get(490).getPhone());
	}

	@Test
	@DisplayName("Record 491: Fax is 330-928-8647")
	void FaxOfRecord491() {
		assertEquals("330-928-8647", customers.get(490).getFax());
	}

	@Test
	@DisplayName("Record 491: Email is todd@malik.com")
	void EmailOfRecord491() {
		assertEquals("todd@malik.com", customers.get(490).getEmail());
	}

	@Test
	@DisplayName("Record 491: Web is http://www.toddmalik.com")
	void WebOfRecord491() {
		assertEquals("http://www.toddmalik.com", customers.get(490).getWeb());
	}
}
