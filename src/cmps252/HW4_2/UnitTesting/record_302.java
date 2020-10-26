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

@Tag("2")
class Record_302 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 302: FirstName is Alexander")
	void FirstNameOfRecord302() {
		assertEquals("Alexander", customers.get(301).getFirstName());
	}

	@Test
	@DisplayName("Record 302: LastName is Widen")
	void LastNameOfRecord302() {
		assertEquals("Widen", customers.get(301).getLastName());
	}

	@Test
	@DisplayName("Record 302: Company is Hokit, David T Esq")
	void CompanyOfRecord302() {
		assertEquals("Hokit, David T Esq", customers.get(301).getCompany());
	}

	@Test
	@DisplayName("Record 302: Address is 118 Mamaroneck Ave")
	void AddressOfRecord302() {
		assertEquals("118 Mamaroneck Ave", customers.get(301).getAddress());
	}

	@Test
	@DisplayName("Record 302: City is Mamaroneck")
	void CityOfRecord302() {
		assertEquals("Mamaroneck", customers.get(301).getCity());
	}

	@Test
	@DisplayName("Record 302: County is Westchester")
	void CountyOfRecord302() {
		assertEquals("Westchester", customers.get(301).getCounty());
	}

	@Test
	@DisplayName("Record 302: State is NY")
	void StateOfRecord302() {
		assertEquals("NY", customers.get(301).getState());
	}

	@Test
	@DisplayName("Record 302: ZIP is 10543")
	void ZIPOfRecord302() {
		assertEquals("10543", customers.get(301).getZIP());
	}

	@Test
	@DisplayName("Record 302: Phone is 914-381-6085")
	void PhoneOfRecord302() {
		assertEquals("914-381-6085", customers.get(301).getPhone());
	}

	@Test
	@DisplayName("Record 302: Fax is 914-381-5838")
	void FaxOfRecord302() {
		assertEquals("914-381-5838", customers.get(301).getFax());
	}

	@Test
	@DisplayName("Record 302: Email is alexander@widen.com")
	void EmailOfRecord302() {
		assertEquals("alexander@widen.com", customers.get(301).getEmail());
	}

	@Test
	@DisplayName("Record 302: Web is http://www.alexanderwiden.com")
	void WebOfRecord302() {
		assertEquals("http://www.alexanderwiden.com", customers.get(301).getWeb());
	}
}
