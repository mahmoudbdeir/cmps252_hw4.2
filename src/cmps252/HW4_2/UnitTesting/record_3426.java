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

@Tag("11")
class Record_3426 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3426: FirstName is Rynaldo")
	void FirstNameOfRecord3426() {
		assertEquals("Rynaldo", customers.get(3425).getFirstName());
	}

	@Test
	@DisplayName("Record 3426: LastName is Penkalski")
	void LastNameOfRecord3426() {
		assertEquals("Penkalski", customers.get(3425).getLastName());
	}

	@Test
	@DisplayName("Record 3426: Company is Thermwood Corp")
	void CompanyOfRecord3426() {
		assertEquals("Thermwood Corp", customers.get(3425).getCompany());
	}

	@Test
	@DisplayName("Record 3426: Address is 306 E Clay St")
	void AddressOfRecord3426() {
		assertEquals("306 E Clay St", customers.get(3425).getAddress());
	}

	@Test
	@DisplayName("Record 3426: City is Richmond")
	void CityOfRecord3426() {
		assertEquals("Richmond", customers.get(3425).getCity());
	}

	@Test
	@DisplayName("Record 3426: County is Richmond City")
	void CountyOfRecord3426() {
		assertEquals("Richmond City", customers.get(3425).getCounty());
	}

	@Test
	@DisplayName("Record 3426: State is VA")
	void StateOfRecord3426() {
		assertEquals("VA", customers.get(3425).getState());
	}

	@Test
	@DisplayName("Record 3426: ZIP is 23219")
	void ZIPOfRecord3426() {
		assertEquals("23219", customers.get(3425).getZIP());
	}

	@Test
	@DisplayName("Record 3426: Phone is 804-648-0591")
	void PhoneOfRecord3426() {
		assertEquals("804-648-0591", customers.get(3425).getPhone());
	}

	@Test
	@DisplayName("Record 3426: Fax is 804-648-4174")
	void FaxOfRecord3426() {
		assertEquals("804-648-4174", customers.get(3425).getFax());
	}

	@Test
	@DisplayName("Record 3426: Email is rynaldo@penkalski.com")
	void EmailOfRecord3426() {
		assertEquals("rynaldo@penkalski.com", customers.get(3425).getEmail());
	}

	@Test
	@DisplayName("Record 3426: Web is http://www.rynaldopenkalski.com")
	void WebOfRecord3426() {
		assertEquals("http://www.rynaldopenkalski.com", customers.get(3425).getWeb());
	}
}
