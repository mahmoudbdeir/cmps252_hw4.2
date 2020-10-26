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

@Tag("21")
class Record_2798 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2798: FirstName is Jason")
	void FirstNameOfRecord2798() {
		assertEquals("Jason", customers.get(2797).getFirstName());
	}

	@Test
	@DisplayName("Record 2798: LastName is Ursprung")
	void LastNameOfRecord2798() {
		assertEquals("Ursprung", customers.get(2797).getLastName());
	}

	@Test
	@DisplayName("Record 2798: Company is Kinkos Copies")
	void CompanyOfRecord2798() {
		assertEquals("Kinkos Copies", customers.get(2797).getCompany());
	}

	@Test
	@DisplayName("Record 2798: Address is 9810 40th Ave Sw  #-c")
	void AddressOfRecord2798() {
		assertEquals("9810 40th Ave Sw  #-c", customers.get(2797).getAddress());
	}

	@Test
	@DisplayName("Record 2798: City is Lakewood")
	void CityOfRecord2798() {
		assertEquals("Lakewood", customers.get(2797).getCity());
	}

	@Test
	@DisplayName("Record 2798: County is Pierce")
	void CountyOfRecord2798() {
		assertEquals("Pierce", customers.get(2797).getCounty());
	}

	@Test
	@DisplayName("Record 2798: State is WA")
	void StateOfRecord2798() {
		assertEquals("WA", customers.get(2797).getState());
	}

	@Test
	@DisplayName("Record 2798: ZIP is 98499")
	void ZIPOfRecord2798() {
		assertEquals("98499", customers.get(2797).getZIP());
	}

	@Test
	@DisplayName("Record 2798: Phone is 253-588-2626")
	void PhoneOfRecord2798() {
		assertEquals("253-588-2626", customers.get(2797).getPhone());
	}

	@Test
	@DisplayName("Record 2798: Fax is 253-588-8742")
	void FaxOfRecord2798() {
		assertEquals("253-588-8742", customers.get(2797).getFax());
	}

	@Test
	@DisplayName("Record 2798: Email is jason@ursprung.com")
	void EmailOfRecord2798() {
		assertEquals("jason@ursprung.com", customers.get(2797).getEmail());
	}

	@Test
	@DisplayName("Record 2798: Web is http://www.jasonursprung.com")
	void WebOfRecord2798() {
		assertEquals("http://www.jasonursprung.com", customers.get(2797).getWeb());
	}
}
