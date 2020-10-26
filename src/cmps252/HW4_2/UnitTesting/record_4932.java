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
class Record_4932 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4932: FirstName is Annette")
	void FirstNameOfRecord4932() {
		assertEquals("Annette", customers.get(4931).getFirstName());
	}

	@Test
	@DisplayName("Record 4932: LastName is Dallis")
	void LastNameOfRecord4932() {
		assertEquals("Dallis", customers.get(4931).getLastName());
	}

	@Test
	@DisplayName("Record 4932: Company is Mclean County Chamber Commrce")
	void CompanyOfRecord4932() {
		assertEquals("Mclean County Chamber Commrce", customers.get(4931).getCompany());
	}

	@Test
	@DisplayName("Record 4932: Address is 938 Halona St  #-a")
	void AddressOfRecord4932() {
		assertEquals("938 Halona St  #-a", customers.get(4931).getAddress());
	}

	@Test
	@DisplayName("Record 4932: City is Honolulu")
	void CityOfRecord4932() {
		assertEquals("Honolulu", customers.get(4931).getCity());
	}

	@Test
	@DisplayName("Record 4932: County is Honolulu")
	void CountyOfRecord4932() {
		assertEquals("Honolulu", customers.get(4931).getCounty());
	}

	@Test
	@DisplayName("Record 4932: State is HI")
	void StateOfRecord4932() {
		assertEquals("HI", customers.get(4931).getState());
	}

	@Test
	@DisplayName("Record 4932: ZIP is 96817")
	void ZIPOfRecord4932() {
		assertEquals("96817", customers.get(4931).getZIP());
	}

	@Test
	@DisplayName("Record 4932: Phone is 808-847-0515")
	void PhoneOfRecord4932() {
		assertEquals("808-847-0515", customers.get(4931).getPhone());
	}

	@Test
	@DisplayName("Record 4932: Fax is 808-847-0528")
	void FaxOfRecord4932() {
		assertEquals("808-847-0528", customers.get(4931).getFax());
	}

	@Test
	@DisplayName("Record 4932: Email is annette@dallis.com")
	void EmailOfRecord4932() {
		assertEquals("annette@dallis.com", customers.get(4931).getEmail());
	}

	@Test
	@DisplayName("Record 4932: Web is http://www.annettedallis.com")
	void WebOfRecord4932() {
		assertEquals("http://www.annettedallis.com", customers.get(4931).getWeb());
	}
}
