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

@Tag("41")
class Record_1860 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1860: FirstName is Antoinette")
	void FirstNameOfRecord1860() {
		assertEquals("Antoinette", customers.get(1859).getFirstName());
	}

	@Test
	@DisplayName("Record 1860: LastName is Pullen")
	void LastNameOfRecord1860() {
		assertEquals("Pullen", customers.get(1859).getLastName());
	}

	@Test
	@DisplayName("Record 1860: Company is Saulsbury Bros")
	void CompanyOfRecord1860() {
		assertEquals("Saulsbury Bros", customers.get(1859).getCompany());
	}

	@Test
	@DisplayName("Record 1860: Address is 2081 Mccrea St")
	void AddressOfRecord1860() {
		assertEquals("2081 Mccrea St", customers.get(1859).getAddress());
	}

	@Test
	@DisplayName("Record 1860: City is Alliance")
	void CityOfRecord1860() {
		assertEquals("Alliance", customers.get(1859).getCity());
	}

	@Test
	@DisplayName("Record 1860: County is Stark")
	void CountyOfRecord1860() {
		assertEquals("Stark", customers.get(1859).getCounty());
	}

	@Test
	@DisplayName("Record 1860: State is OH")
	void StateOfRecord1860() {
		assertEquals("OH", customers.get(1859).getState());
	}

	@Test
	@DisplayName("Record 1860: ZIP is 44601")
	void ZIPOfRecord1860() {
		assertEquals("44601", customers.get(1859).getZIP());
	}

	@Test
	@DisplayName("Record 1860: Phone is 330-823-3069")
	void PhoneOfRecord1860() {
		assertEquals("330-823-3069", customers.get(1859).getPhone());
	}

	@Test
	@DisplayName("Record 1860: Fax is 330-823-7522")
	void FaxOfRecord1860() {
		assertEquals("330-823-7522", customers.get(1859).getFax());
	}

	@Test
	@DisplayName("Record 1860: Email is antoinette@pullen.com")
	void EmailOfRecord1860() {
		assertEquals("antoinette@pullen.com", customers.get(1859).getEmail());
	}

	@Test
	@DisplayName("Record 1860: Web is http://www.antoinettepullen.com")
	void WebOfRecord1860() {
		assertEquals("http://www.antoinettepullen.com", customers.get(1859).getWeb());
	}
}
