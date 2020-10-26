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

@Tag("42")
class Record_2397 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2397: FirstName is Deanne")
	void FirstNameOfRecord2397() {
		assertEquals("Deanne", customers.get(2396).getFirstName());
	}

	@Test
	@DisplayName("Record 2397: LastName is Arunachalam")
	void LastNameOfRecord2397() {
		assertEquals("Arunachalam", customers.get(2396).getLastName());
	}

	@Test
	@DisplayName("Record 2397: Company is Steak & Sword Restaurant")
	void CompanyOfRecord2397() {
		assertEquals("Steak & Sword Restaurant", customers.get(2396).getCompany());
	}

	@Test
	@DisplayName("Record 2397: Address is 1547 Starr Dr  #-i")
	void AddressOfRecord2397() {
		assertEquals("1547 Starr Dr  #-i", customers.get(2396).getAddress());
	}

	@Test
	@DisplayName("Record 2397: City is Yuba City")
	void CityOfRecord2397() {
		assertEquals("Yuba City", customers.get(2396).getCity());
	}

	@Test
	@DisplayName("Record 2397: County is Sutter")
	void CountyOfRecord2397() {
		assertEquals("Sutter", customers.get(2396).getCounty());
	}

	@Test
	@DisplayName("Record 2397: State is CA")
	void StateOfRecord2397() {
		assertEquals("CA", customers.get(2396).getState());
	}

	@Test
	@DisplayName("Record 2397: ZIP is 95993")
	void ZIPOfRecord2397() {
		assertEquals("95993", customers.get(2396).getZIP());
	}

	@Test
	@DisplayName("Record 2397: Phone is 530-755-1905")
	void PhoneOfRecord2397() {
		assertEquals("530-755-1905", customers.get(2396).getPhone());
	}

	@Test
	@DisplayName("Record 2397: Fax is 530-755-2732")
	void FaxOfRecord2397() {
		assertEquals("530-755-2732", customers.get(2396).getFax());
	}

	@Test
	@DisplayName("Record 2397: Email is deanne@arunachalam.com")
	void EmailOfRecord2397() {
		assertEquals("deanne@arunachalam.com", customers.get(2396).getEmail());
	}

	@Test
	@DisplayName("Record 2397: Web is http://www.deannearunachalam.com")
	void WebOfRecord2397() {
		assertEquals("http://www.deannearunachalam.com", customers.get(2396).getWeb());
	}
}
