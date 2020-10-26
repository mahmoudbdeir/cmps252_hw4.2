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

@Tag("8")
class Record_3577 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3577: FirstName is Brandi")
	void FirstNameOfRecord3577() {
		assertEquals("Brandi", customers.get(3576).getFirstName());
	}

	@Test
	@DisplayName("Record 3577: LastName is Lockley")
	void LastNameOfRecord3577() {
		assertEquals("Lockley", customers.get(3576).getLastName());
	}

	@Test
	@DisplayName("Record 3577: Company is Galil Motion Control Inc")
	void CompanyOfRecord3577() {
		assertEquals("Galil Motion Control Inc", customers.get(3576).getCompany());
	}

	@Test
	@DisplayName("Record 3577: Address is 1 Morris St")
	void AddressOfRecord3577() {
		assertEquals("1 Morris St", customers.get(3576).getAddress());
	}

	@Test
	@DisplayName("Record 3577: City is Paterson")
	void CityOfRecord3577() {
		assertEquals("Paterson", customers.get(3576).getCity());
	}

	@Test
	@DisplayName("Record 3577: County is Passaic")
	void CountyOfRecord3577() {
		assertEquals("Passaic", customers.get(3576).getCounty());
	}

	@Test
	@DisplayName("Record 3577: State is NJ")
	void StateOfRecord3577() {
		assertEquals("NJ", customers.get(3576).getState());
	}

	@Test
	@DisplayName("Record 3577: ZIP is 7501")
	void ZIPOfRecord3577() {
		assertEquals("7501", customers.get(3576).getZIP());
	}

	@Test
	@DisplayName("Record 3577: Phone is 973-345-8940")
	void PhoneOfRecord3577() {
		assertEquals("973-345-8940", customers.get(3576).getPhone());
	}

	@Test
	@DisplayName("Record 3577: Fax is 973-345-8613")
	void FaxOfRecord3577() {
		assertEquals("973-345-8613", customers.get(3576).getFax());
	}

	@Test
	@DisplayName("Record 3577: Email is brandi@lockley.com")
	void EmailOfRecord3577() {
		assertEquals("brandi@lockley.com", customers.get(3576).getEmail());
	}

	@Test
	@DisplayName("Record 3577: Web is http://www.brandilockley.com")
	void WebOfRecord3577() {
		assertEquals("http://www.brandilockley.com", customers.get(3576).getWeb());
	}
}
