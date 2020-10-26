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

@Tag("47")
class Record_3979 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3979: FirstName is Moises")
	void FirstNameOfRecord3979() {
		assertEquals("Moises", customers.get(3978).getFirstName());
	}

	@Test
	@DisplayName("Record 3979: LastName is Gilmartin")
	void LastNameOfRecord3979() {
		assertEquals("Gilmartin", customers.get(3978).getLastName());
	}

	@Test
	@DisplayName("Record 3979: Company is Lorvic Corporation")
	void CompanyOfRecord3979() {
		assertEquals("Lorvic Corporation", customers.get(3978).getCompany());
	}

	@Test
	@DisplayName("Record 3979: Address is 15405 S San Pedro St")
	void AddressOfRecord3979() {
		assertEquals("15405 S San Pedro St", customers.get(3978).getAddress());
	}

	@Test
	@DisplayName("Record 3979: City is Gardena")
	void CityOfRecord3979() {
		assertEquals("Gardena", customers.get(3978).getCity());
	}

	@Test
	@DisplayName("Record 3979: County is Los Angeles")
	void CountyOfRecord3979() {
		assertEquals("Los Angeles", customers.get(3978).getCounty());
	}

	@Test
	@DisplayName("Record 3979: State is CA")
	void StateOfRecord3979() {
		assertEquals("CA", customers.get(3978).getState());
	}

	@Test
	@DisplayName("Record 3979: ZIP is 90248")
	void ZIPOfRecord3979() {
		assertEquals("90248", customers.get(3978).getZIP());
	}

	@Test
	@DisplayName("Record 3979: Phone is 310-532-0748")
	void PhoneOfRecord3979() {
		assertEquals("310-532-0748", customers.get(3978).getPhone());
	}

	@Test
	@DisplayName("Record 3979: Fax is 310-532-1899")
	void FaxOfRecord3979() {
		assertEquals("310-532-1899", customers.get(3978).getFax());
	}

	@Test
	@DisplayName("Record 3979: Email is moises@gilmartin.com")
	void EmailOfRecord3979() {
		assertEquals("moises@gilmartin.com", customers.get(3978).getEmail());
	}

	@Test
	@DisplayName("Record 3979: Web is http://www.moisesgilmartin.com")
	void WebOfRecord3979() {
		assertEquals("http://www.moisesgilmartin.com", customers.get(3978).getWeb());
	}
}
