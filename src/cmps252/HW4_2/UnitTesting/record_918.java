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
class Record_918 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 918: FirstName is Kraig")
	void FirstNameOfRecord918() {
		assertEquals("Kraig", customers.get(917).getFirstName());
	}

	@Test
	@DisplayName("Record 918: LastName is Fenix")
	void LastNameOfRecord918() {
		assertEquals("Fenix", customers.get(917).getLastName());
	}

	@Test
	@DisplayName("Record 918: Company is Alcarese, J Shawn Esq")
	void CompanyOfRecord918() {
		assertEquals("Alcarese, J Shawn Esq", customers.get(917).getCompany());
	}

	@Test
	@DisplayName("Record 918: Address is 2715 Blake St")
	void AddressOfRecord918() {
		assertEquals("2715 Blake St", customers.get(917).getAddress());
	}

	@Test
	@DisplayName("Record 918: City is Denver")
	void CityOfRecord918() {
		assertEquals("Denver", customers.get(917).getCity());
	}

	@Test
	@DisplayName("Record 918: County is Denver")
	void CountyOfRecord918() {
		assertEquals("Denver", customers.get(917).getCounty());
	}

	@Test
	@DisplayName("Record 918: State is CO")
	void StateOfRecord918() {
		assertEquals("CO", customers.get(917).getState());
	}

	@Test
	@DisplayName("Record 918: ZIP is 80205")
	void ZIPOfRecord918() {
		assertEquals("80205", customers.get(917).getZIP());
	}

	@Test
	@DisplayName("Record 918: Phone is 303-297-3349")
	void PhoneOfRecord918() {
		assertEquals("303-297-3349", customers.get(917).getPhone());
	}

	@Test
	@DisplayName("Record 918: Fax is 303-297-9442")
	void FaxOfRecord918() {
		assertEquals("303-297-9442", customers.get(917).getFax());
	}

	@Test
	@DisplayName("Record 918: Email is kraig@fenix.com")
	void EmailOfRecord918() {
		assertEquals("kraig@fenix.com", customers.get(917).getEmail());
	}

	@Test
	@DisplayName("Record 918: Web is http://www.kraigfenix.com")
	void WebOfRecord918() {
		assertEquals("http://www.kraigfenix.com", customers.get(917).getWeb());
	}
}
