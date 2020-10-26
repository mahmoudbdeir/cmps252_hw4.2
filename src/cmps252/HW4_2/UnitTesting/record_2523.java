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
class Record_2523 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2523: FirstName is Hollis")
	void FirstNameOfRecord2523() {
		assertEquals("Hollis", customers.get(2522).getFirstName());
	}

	@Test
	@DisplayName("Record 2523: LastName is Leete")
	void LastNameOfRecord2523() {
		assertEquals("Leete", customers.get(2522).getLastName());
	}

	@Test
	@DisplayName("Record 2523: Company is Adley, Michael W Esq")
	void CompanyOfRecord2523() {
		assertEquals("Adley, Michael W Esq", customers.get(2522).getCompany());
	}

	@Test
	@DisplayName("Record 2523: Address is 574 Mantoloking Rd")
	void AddressOfRecord2523() {
		assertEquals("574 Mantoloking Rd", customers.get(2522).getAddress());
	}

	@Test
	@DisplayName("Record 2523: City is Brick")
	void CityOfRecord2523() {
		assertEquals("Brick", customers.get(2522).getCity());
	}

	@Test
	@DisplayName("Record 2523: County is Ocean")
	void CountyOfRecord2523() {
		assertEquals("Ocean", customers.get(2522).getCounty());
	}

	@Test
	@DisplayName("Record 2523: State is NJ")
	void StateOfRecord2523() {
		assertEquals("NJ", customers.get(2522).getState());
	}

	@Test
	@DisplayName("Record 2523: ZIP is 8723")
	void ZIPOfRecord2523() {
		assertEquals("8723", customers.get(2522).getZIP());
	}

	@Test
	@DisplayName("Record 2523: Phone is 732-477-8097")
	void PhoneOfRecord2523() {
		assertEquals("732-477-8097", customers.get(2522).getPhone());
	}

	@Test
	@DisplayName("Record 2523: Fax is 732-477-7379")
	void FaxOfRecord2523() {
		assertEquals("732-477-7379", customers.get(2522).getFax());
	}

	@Test
	@DisplayName("Record 2523: Email is hollis@leete.com")
	void EmailOfRecord2523() {
		assertEquals("hollis@leete.com", customers.get(2522).getEmail());
	}

	@Test
	@DisplayName("Record 2523: Web is http://www.hollisleete.com")
	void WebOfRecord2523() {
		assertEquals("http://www.hollisleete.com", customers.get(2522).getWeb());
	}
}
