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
class Record_1566 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1566: FirstName is Gabriela")
	void FirstNameOfRecord1566() {
		assertEquals("Gabriela", customers.get(1565).getFirstName());
	}

	@Test
	@DisplayName("Record 1566: LastName is Paddilla")
	void LastNameOfRecord1566() {
		assertEquals("Paddilla", customers.get(1565).getLastName());
	}

	@Test
	@DisplayName("Record 1566: Company is Kinkos Copies")
	void CompanyOfRecord1566() {
		assertEquals("Kinkos Copies", customers.get(1565).getCompany());
	}

	@Test
	@DisplayName("Record 1566: Address is 260 W Archer")
	void AddressOfRecord1566() {
		assertEquals("260 W Archer", customers.get(1565).getAddress());
	}

	@Test
	@DisplayName("Record 1566: City is Murtaugh")
	void CityOfRecord1566() {
		assertEquals("Murtaugh", customers.get(1565).getCity());
	}

	@Test
	@DisplayName("Record 1566: County is Twin Falls")
	void CountyOfRecord1566() {
		assertEquals("Twin Falls", customers.get(1565).getCounty());
	}

	@Test
	@DisplayName("Record 1566: State is ID")
	void StateOfRecord1566() {
		assertEquals("ID", customers.get(1565).getState());
	}

	@Test
	@DisplayName("Record 1566: ZIP is 83344")
	void ZIPOfRecord1566() {
		assertEquals("83344", customers.get(1565).getZIP());
	}

	@Test
	@DisplayName("Record 1566: Phone is 208-432-4395")
	void PhoneOfRecord1566() {
		assertEquals("208-432-4395", customers.get(1565).getPhone());
	}

	@Test
	@DisplayName("Record 1566: Fax is 208-432-1205")
	void FaxOfRecord1566() {
		assertEquals("208-432-1205", customers.get(1565).getFax());
	}

	@Test
	@DisplayName("Record 1566: Email is gabriela@paddilla.com")
	void EmailOfRecord1566() {
		assertEquals("gabriela@paddilla.com", customers.get(1565).getEmail());
	}

	@Test
	@DisplayName("Record 1566: Web is http://www.gabrielapaddilla.com")
	void WebOfRecord1566() {
		assertEquals("http://www.gabrielapaddilla.com", customers.get(1565).getWeb());
	}
}
