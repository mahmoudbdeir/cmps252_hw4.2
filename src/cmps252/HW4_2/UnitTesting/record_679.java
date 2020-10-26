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

@Tag("17")
class Record_679 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 679: FirstName is Milagros")
	void FirstNameOfRecord679() {
		assertEquals("Milagros", customers.get(678).getFirstName());
	}

	@Test
	@DisplayName("Record 679: LastName is Slomba")
	void LastNameOfRecord679() {
		assertEquals("Slomba", customers.get(678).getLastName());
	}

	@Test
	@DisplayName("Record 679: Company is Maruca, William H Esq")
	void CompanyOfRecord679() {
		assertEquals("Maruca, William H Esq", customers.get(678).getCompany());
	}

	@Test
	@DisplayName("Record 679: Address is 8027 Front Beach Rd")
	void AddressOfRecord679() {
		assertEquals("8027 Front Beach Rd", customers.get(678).getAddress());
	}

	@Test
	@DisplayName("Record 679: City is Panama City Beach")
	void CityOfRecord679() {
		assertEquals("Panama City Beach", customers.get(678).getCity());
	}

	@Test
	@DisplayName("Record 679: County is Bay")
	void CountyOfRecord679() {
		assertEquals("Bay", customers.get(678).getCounty());
	}

	@Test
	@DisplayName("Record 679: State is FL")
	void StateOfRecord679() {
		assertEquals("FL", customers.get(678).getState());
	}

	@Test
	@DisplayName("Record 679: ZIP is 32407")
	void ZIPOfRecord679() {
		assertEquals("32407", customers.get(678).getZIP());
	}

	@Test
	@DisplayName("Record 679: Phone is 850-230-8591")
	void PhoneOfRecord679() {
		assertEquals("850-230-8591", customers.get(678).getPhone());
	}

	@Test
	@DisplayName("Record 679: Fax is 850-230-3324")
	void FaxOfRecord679() {
		assertEquals("850-230-3324", customers.get(678).getFax());
	}

	@Test
	@DisplayName("Record 679: Email is milagros@slomba.com")
	void EmailOfRecord679() {
		assertEquals("milagros@slomba.com", customers.get(678).getEmail());
	}

	@Test
	@DisplayName("Record 679: Web is http://www.milagrosslomba.com")
	void WebOfRecord679() {
		assertEquals("http://www.milagrosslomba.com", customers.get(678).getWeb());
	}
}
