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

@Tag("31")
class Record_182 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 182: FirstName is Phoebe")
	void FirstNameOfRecord182() {
		assertEquals("Phoebe", customers.get(181).getFirstName());
	}

	@Test
	@DisplayName("Record 182: LastName is Ketler")
	void LastNameOfRecord182() {
		assertEquals("Ketler", customers.get(181).getLastName());
	}

	@Test
	@DisplayName("Record 182: Company is Mcbee, Clint M Esq")
	void CompanyOfRecord182() {
		assertEquals("Mcbee, Clint M Esq", customers.get(181).getCompany());
	}

	@Test
	@DisplayName("Record 182: Address is 2820 E La Cresta Ave")
	void AddressOfRecord182() {
		assertEquals("2820 E La Cresta Ave", customers.get(181).getAddress());
	}

	@Test
	@DisplayName("Record 182: City is Anahym")
	void CityOfRecord182() {
		assertEquals("Anahym", customers.get(181).getCity());
	}

	@Test
	@DisplayName("Record 182: County is Orange")
	void CountyOfRecord182() {
		assertEquals("Orange", customers.get(181).getCounty());
	}

	@Test
	@DisplayName("Record 182: State is CA")
	void StateOfRecord182() {
		assertEquals("CA", customers.get(181).getState());
	}

	@Test
	@DisplayName("Record 182: ZIP is 92806")
	void ZIPOfRecord182() {
		assertEquals("92806", customers.get(181).getZIP());
	}

	@Test
	@DisplayName("Record 182: Phone is 714-632-0622")
	void PhoneOfRecord182() {
		assertEquals("714-632-0622", customers.get(181).getPhone());
	}

	@Test
	@DisplayName("Record 182: Fax is 714-632-6152")
	void FaxOfRecord182() {
		assertEquals("714-632-6152", customers.get(181).getFax());
	}

	@Test
	@DisplayName("Record 182: Email is phoebe@ketler.com")
	void EmailOfRecord182() {
		assertEquals("phoebe@ketler.com", customers.get(181).getEmail());
	}

	@Test
	@DisplayName("Record 182: Web is http://www.phoebeketler.com")
	void WebOfRecord182() {
		assertEquals("http://www.phoebeketler.com", customers.get(181).getWeb());
	}
}
