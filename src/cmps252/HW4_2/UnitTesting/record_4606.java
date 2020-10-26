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

@Tag("6")
class Record_4606 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4606: FirstName is Tim")
	void FirstNameOfRecord4606() {
		assertEquals("Tim", customers.get(4605).getFirstName());
	}

	@Test
	@DisplayName("Record 4606: LastName is Tortorelli")
	void LastNameOfRecord4606() {
		assertEquals("Tortorelli", customers.get(4605).getLastName());
	}

	@Test
	@DisplayName("Record 4606: Company is Auh Sunmi Yun")
	void CompanyOfRecord4606() {
		assertEquals("Auh Sunmi Yun", customers.get(4605).getCompany());
	}

	@Test
	@DisplayName("Record 4606: Address is 795 S Solano Dr")
	void AddressOfRecord4606() {
		assertEquals("795 S Solano Dr", customers.get(4605).getAddress());
	}

	@Test
	@DisplayName("Record 4606: City is Las Cruces")
	void CityOfRecord4606() {
		assertEquals("Las Cruces", customers.get(4605).getCity());
	}

	@Test
	@DisplayName("Record 4606: County is Dona Ana")
	void CountyOfRecord4606() {
		assertEquals("Dona Ana", customers.get(4605).getCounty());
	}

	@Test
	@DisplayName("Record 4606: State is NM")
	void StateOfRecord4606() {
		assertEquals("NM", customers.get(4605).getState());
	}

	@Test
	@DisplayName("Record 4606: ZIP is 88001")
	void ZIPOfRecord4606() {
		assertEquals("88001", customers.get(4605).getZIP());
	}

	@Test
	@DisplayName("Record 4606: Phone is 505-524-3990")
	void PhoneOfRecord4606() {
		assertEquals("505-524-3990", customers.get(4605).getPhone());
	}

	@Test
	@DisplayName("Record 4606: Fax is 505-524-0888")
	void FaxOfRecord4606() {
		assertEquals("505-524-0888", customers.get(4605).getFax());
	}

	@Test
	@DisplayName("Record 4606: Email is tim@tortorelli.com")
	void EmailOfRecord4606() {
		assertEquals("tim@tortorelli.com", customers.get(4605).getEmail());
	}

	@Test
	@DisplayName("Record 4606: Web is http://www.timtortorelli.com")
	void WebOfRecord4606() {
		assertEquals("http://www.timtortorelli.com", customers.get(4605).getWeb());
	}
}
