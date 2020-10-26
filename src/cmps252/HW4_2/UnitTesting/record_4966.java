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

@Tag("49")
class Record_4966 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4966: FirstName is Bennett")
	void FirstNameOfRecord4966() {
		assertEquals("Bennett", customers.get(4965).getFirstName());
	}

	@Test
	@DisplayName("Record 4966: LastName is Sulik")
	void LastNameOfRecord4966() {
		assertEquals("Sulik", customers.get(4965).getLastName());
	}

	@Test
	@DisplayName("Record 4966: Company is Watson, Robert J Esq")
	void CompanyOfRecord4966() {
		assertEquals("Watson, Robert J Esq", customers.get(4965).getCompany());
	}

	@Test
	@DisplayName("Record 4966: Address is 315 Broadway St")
	void AddressOfRecord4966() {
		assertEquals("315 Broadway St", customers.get(4965).getAddress());
	}

	@Test
	@DisplayName("Record 4966: City is Baraboo")
	void CityOfRecord4966() {
		assertEquals("Baraboo", customers.get(4965).getCity());
	}

	@Test
	@DisplayName("Record 4966: County is Sauk")
	void CountyOfRecord4966() {
		assertEquals("Sauk", customers.get(4965).getCounty());
	}

	@Test
	@DisplayName("Record 4966: State is WI")
	void StateOfRecord4966() {
		assertEquals("WI", customers.get(4965).getState());
	}

	@Test
	@DisplayName("Record 4966: ZIP is 53913")
	void ZIPOfRecord4966() {
		assertEquals("53913", customers.get(4965).getZIP());
	}

	@Test
	@DisplayName("Record 4966: Phone is 608-356-9817")
	void PhoneOfRecord4966() {
		assertEquals("608-356-9817", customers.get(4965).getPhone());
	}

	@Test
	@DisplayName("Record 4966: Fax is 608-356-1747")
	void FaxOfRecord4966() {
		assertEquals("608-356-1747", customers.get(4965).getFax());
	}

	@Test
	@DisplayName("Record 4966: Email is bennett@sulik.com")
	void EmailOfRecord4966() {
		assertEquals("bennett@sulik.com", customers.get(4965).getEmail());
	}

	@Test
	@DisplayName("Record 4966: Web is http://www.bennettsulik.com")
	void WebOfRecord4966() {
		assertEquals("http://www.bennettsulik.com", customers.get(4965).getWeb());
	}
}
