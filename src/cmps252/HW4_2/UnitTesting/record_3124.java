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

@Tag("5")
class Record_3124 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3124: FirstName is Greg")
	void FirstNameOfRecord3124() {
		assertEquals("Greg", customers.get(3123).getFirstName());
	}

	@Test
	@DisplayName("Record 3124: LastName is Famiano")
	void LastNameOfRecord3124() {
		assertEquals("Famiano", customers.get(3123).getLastName());
	}

	@Test
	@DisplayName("Record 3124: Company is Evens, Timothy W Esq")
	void CompanyOfRecord3124() {
		assertEquals("Evens, Timothy W Esq", customers.get(3123).getCompany());
	}

	@Test
	@DisplayName("Record 3124: Address is Box #-28")
	void AddressOfRecord3124() {
		assertEquals("Box #-28", customers.get(3123).getAddress());
	}

	@Test
	@DisplayName("Record 3124: City is Appleton")
	void CityOfRecord3124() {
		assertEquals("Appleton", customers.get(3123).getCity());
	}

	@Test
	@DisplayName("Record 3124: County is Klickitat")
	void CountyOfRecord3124() {
		assertEquals("Klickitat", customers.get(3123).getCounty());
	}

	@Test
	@DisplayName("Record 3124: State is WA")
	void StateOfRecord3124() {
		assertEquals("WA", customers.get(3123).getState());
	}

	@Test
	@DisplayName("Record 3124: ZIP is 98602")
	void ZIPOfRecord3124() {
		assertEquals("98602", customers.get(3123).getZIP());
	}

	@Test
	@DisplayName("Record 3124: Phone is 509-365-7048")
	void PhoneOfRecord3124() {
		assertEquals("509-365-7048", customers.get(3123).getPhone());
	}

	@Test
	@DisplayName("Record 3124: Fax is 509-365-0061")
	void FaxOfRecord3124() {
		assertEquals("509-365-0061", customers.get(3123).getFax());
	}

	@Test
	@DisplayName("Record 3124: Email is Greg@famiano.com")
	void EmailOfRecord3124() {
		assertEquals("Greg@famiano.com", customers.get(3123).getEmail());
	}

	@Test
	@DisplayName("Record 3124: Web is http://www.Gregfamiano.com")
	void WebOfRecord3124() {
		assertEquals("http://www.Gregfamiano.com", customers.get(3123).getWeb());
	}
}
