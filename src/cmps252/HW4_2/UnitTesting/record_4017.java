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

@Tag("38")
class Record_4017 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4017: FirstName is Glenn")
	void FirstNameOfRecord4017() {
		assertEquals("Glenn", customers.get(4016).getFirstName());
	}

	@Test
	@DisplayName("Record 4017: LastName is Liedke")
	void LastNameOfRecord4017() {
		assertEquals("Liedke", customers.get(4016).getLastName());
	}

	@Test
	@DisplayName("Record 4017: Company is On Time Signs & Graphics")
	void CompanyOfRecord4017() {
		assertEquals("On Time Signs & Graphics", customers.get(4016).getCompany());
	}

	@Test
	@DisplayName("Record 4017: Address is 2125 S Treadaway Blvd")
	void AddressOfRecord4017() {
		assertEquals("2125 S Treadaway Blvd", customers.get(4016).getAddress());
	}

	@Test
	@DisplayName("Record 4017: City is Abilene")
	void CityOfRecord4017() {
		assertEquals("Abilene", customers.get(4016).getCity());
	}

	@Test
	@DisplayName("Record 4017: County is Taylor")
	void CountyOfRecord4017() {
		assertEquals("Taylor", customers.get(4016).getCounty());
	}

	@Test
	@DisplayName("Record 4017: State is TX")
	void StateOfRecord4017() {
		assertEquals("TX", customers.get(4016).getState());
	}

	@Test
	@DisplayName("Record 4017: ZIP is 79602")
	void ZIPOfRecord4017() {
		assertEquals("79602", customers.get(4016).getZIP());
	}

	@Test
	@DisplayName("Record 4017: Phone is 325-677-8572")
	void PhoneOfRecord4017() {
		assertEquals("325-677-8572", customers.get(4016).getPhone());
	}

	@Test
	@DisplayName("Record 4017: Fax is 325-677-0747")
	void FaxOfRecord4017() {
		assertEquals("325-677-0747", customers.get(4016).getFax());
	}

	@Test
	@DisplayName("Record 4017: Email is glenn@liedke.com")
	void EmailOfRecord4017() {
		assertEquals("glenn@liedke.com", customers.get(4016).getEmail());
	}

	@Test
	@DisplayName("Record 4017: Web is http://www.glennliedke.com")
	void WebOfRecord4017() {
		assertEquals("http://www.glennliedke.com", customers.get(4016).getWeb());
	}
}
