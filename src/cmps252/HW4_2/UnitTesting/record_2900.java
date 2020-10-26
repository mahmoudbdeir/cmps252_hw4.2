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

@Tag("33")
class Record_2900 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2900: FirstName is Sabrina")
	void FirstNameOfRecord2900() {
		assertEquals("Sabrina", customers.get(2899).getFirstName());
	}

	@Test
	@DisplayName("Record 2900: LastName is Kitterman")
	void LastNameOfRecord2900() {
		assertEquals("Kitterman", customers.get(2899).getLastName());
	}

	@Test
	@DisplayName("Record 2900: Company is Union Leader Printing")
	void CompanyOfRecord2900() {
		assertEquals("Union Leader Printing", customers.get(2899).getCompany());
	}

	@Test
	@DisplayName("Record 2900: Address is 16250 Northland Dr")
	void AddressOfRecord2900() {
		assertEquals("16250 Northland Dr", customers.get(2899).getAddress());
	}

	@Test
	@DisplayName("Record 2900: City is Southfield")
	void CityOfRecord2900() {
		assertEquals("Southfield", customers.get(2899).getCity());
	}

	@Test
	@DisplayName("Record 2900: County is Oakland")
	void CountyOfRecord2900() {
		assertEquals("Oakland", customers.get(2899).getCounty());
	}

	@Test
	@DisplayName("Record 2900: State is MI")
	void StateOfRecord2900() {
		assertEquals("MI", customers.get(2899).getState());
	}

	@Test
	@DisplayName("Record 2900: ZIP is 48075")
	void ZIPOfRecord2900() {
		assertEquals("48075", customers.get(2899).getZIP());
	}

	@Test
	@DisplayName("Record 2900: Phone is 248-569-8523")
	void PhoneOfRecord2900() {
		assertEquals("248-569-8523", customers.get(2899).getPhone());
	}

	@Test
	@DisplayName("Record 2900: Fax is 248-569-6723")
	void FaxOfRecord2900() {
		assertEquals("248-569-6723", customers.get(2899).getFax());
	}

	@Test
	@DisplayName("Record 2900: Email is sabrina@kitterman.com")
	void EmailOfRecord2900() {
		assertEquals("sabrina@kitterman.com", customers.get(2899).getEmail());
	}

	@Test
	@DisplayName("Record 2900: Web is http://www.sabrinakitterman.com")
	void WebOfRecord2900() {
		assertEquals("http://www.sabrinakitterman.com", customers.get(2899).getWeb());
	}
}
