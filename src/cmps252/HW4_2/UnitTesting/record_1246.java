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

@Tag("30")
class Record_1246 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1246: FirstName is Valencia")
	void FirstNameOfRecord1246() {
		assertEquals("Valencia", customers.get(1245).getFirstName());
	}

	@Test
	@DisplayName("Record 1246: LastName is Ganas")
	void LastNameOfRecord1246() {
		assertEquals("Ganas", customers.get(1245).getLastName());
	}

	@Test
	@DisplayName("Record 1246: Company is Cielo, Douglas W Esq")
	void CompanyOfRecord1246() {
		assertEquals("Cielo, Douglas W Esq", customers.get(1245).getCompany());
	}

	@Test
	@DisplayName("Record 1246: Address is 419 Boylston St")
	void AddressOfRecord1246() {
		assertEquals("419 Boylston St", customers.get(1245).getAddress());
	}

	@Test
	@DisplayName("Record 1246: City is Boston")
	void CityOfRecord1246() {
		assertEquals("Boston", customers.get(1245).getCity());
	}

	@Test
	@DisplayName("Record 1246: County is Suffolk")
	void CountyOfRecord1246() {
		assertEquals("Suffolk", customers.get(1245).getCounty());
	}

	@Test
	@DisplayName("Record 1246: State is MA")
	void StateOfRecord1246() {
		assertEquals("MA", customers.get(1245).getState());
	}

	@Test
	@DisplayName("Record 1246: ZIP is 2116")
	void ZIPOfRecord1246() {
		assertEquals("2116", customers.get(1245).getZIP());
	}

	@Test
	@DisplayName("Record 1246: Phone is 617-421-0768")
	void PhoneOfRecord1246() {
		assertEquals("617-421-0768", customers.get(1245).getPhone());
	}

	@Test
	@DisplayName("Record 1246: Fax is 617-421-0246")
	void FaxOfRecord1246() {
		assertEquals("617-421-0246", customers.get(1245).getFax());
	}

	@Test
	@DisplayName("Record 1246: Email is valencia@ganas.com")
	void EmailOfRecord1246() {
		assertEquals("valencia@ganas.com", customers.get(1245).getEmail());
	}

	@Test
	@DisplayName("Record 1246: Web is http://www.valenciaganas.com")
	void WebOfRecord1246() {
		assertEquals("http://www.valenciaganas.com", customers.get(1245).getWeb());
	}
}
