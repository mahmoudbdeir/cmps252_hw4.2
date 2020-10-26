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

@Tag("23")
class Record_2601 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2601: FirstName is Marietta")
	void FirstNameOfRecord2601() {
		assertEquals("Marietta", customers.get(2600).getFirstName());
	}

	@Test
	@DisplayName("Record 2601: LastName is Killough")
	void LastNameOfRecord2601() {
		assertEquals("Killough", customers.get(2600).getLastName());
	}

	@Test
	@DisplayName("Record 2601: Company is Stone, Thomas S Esq")
	void CompanyOfRecord2601() {
		assertEquals("Stone, Thomas S Esq", customers.get(2600).getCompany());
	}

	@Test
	@DisplayName("Record 2601: Address is 400 E Main St  #-3")
	void AddressOfRecord2601() {
		assertEquals("400 E Main St  #-3", customers.get(2600).getAddress());
	}

	@Test
	@DisplayName("Record 2601: City is Canfield")
	void CityOfRecord2601() {
		assertEquals("Canfield", customers.get(2600).getCity());
	}

	@Test
	@DisplayName("Record 2601: County is Mahoning")
	void CountyOfRecord2601() {
		assertEquals("Mahoning", customers.get(2600).getCounty());
	}

	@Test
	@DisplayName("Record 2601: State is OH")
	void StateOfRecord2601() {
		assertEquals("OH", customers.get(2600).getState());
	}

	@Test
	@DisplayName("Record 2601: ZIP is 44406")
	void ZIPOfRecord2601() {
		assertEquals("44406", customers.get(2600).getZIP());
	}

	@Test
	@DisplayName("Record 2601: Phone is 330-533-7587")
	void PhoneOfRecord2601() {
		assertEquals("330-533-7587", customers.get(2600).getPhone());
	}

	@Test
	@DisplayName("Record 2601: Fax is 330-533-9115")
	void FaxOfRecord2601() {
		assertEquals("330-533-9115", customers.get(2600).getFax());
	}

	@Test
	@DisplayName("Record 2601: Email is marietta@killough.com")
	void EmailOfRecord2601() {
		assertEquals("marietta@killough.com", customers.get(2600).getEmail());
	}

	@Test
	@DisplayName("Record 2601: Web is http://www.mariettakillough.com")
	void WebOfRecord2601() {
		assertEquals("http://www.mariettakillough.com", customers.get(2600).getWeb());
	}
}
