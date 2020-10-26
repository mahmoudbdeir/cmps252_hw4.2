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

@Tag("39")
class Record_1203 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1203: FirstName is Rosanne")
	void FirstNameOfRecord1203() {
		assertEquals("Rosanne", customers.get(1202).getFirstName());
	}

	@Test
	@DisplayName("Record 1203: LastName is Generoso")
	void LastNameOfRecord1203() {
		assertEquals("Generoso", customers.get(1202).getLastName());
	}

	@Test
	@DisplayName("Record 1203: Company is Architectura")
	void CompanyOfRecord1203() {
		assertEquals("Architectura", customers.get(1202).getCompany());
	}

	@Test
	@DisplayName("Record 1203: Address is 4 Spinning Wheel Ln")
	void AddressOfRecord1203() {
		assertEquals("4 Spinning Wheel Ln", customers.get(1202).getAddress());
	}

	@Test
	@DisplayName("Record 1203: City is Norwalk")
	void CityOfRecord1203() {
		assertEquals("Norwalk", customers.get(1202).getCity());
	}

	@Test
	@DisplayName("Record 1203: County is Fairfield")
	void CountyOfRecord1203() {
		assertEquals("Fairfield", customers.get(1202).getCounty());
	}

	@Test
	@DisplayName("Record 1203: State is CT")
	void StateOfRecord1203() {
		assertEquals("CT", customers.get(1202).getState());
	}

	@Test
	@DisplayName("Record 1203: ZIP is 6851")
	void ZIPOfRecord1203() {
		assertEquals("6851", customers.get(1202).getZIP());
	}

	@Test
	@DisplayName("Record 1203: Phone is 203-846-3238")
	void PhoneOfRecord1203() {
		assertEquals("203-846-3238", customers.get(1202).getPhone());
	}

	@Test
	@DisplayName("Record 1203: Fax is 203-846-2961")
	void FaxOfRecord1203() {
		assertEquals("203-846-2961", customers.get(1202).getFax());
	}

	@Test
	@DisplayName("Record 1203: Email is rosanne@generoso.com")
	void EmailOfRecord1203() {
		assertEquals("rosanne@generoso.com", customers.get(1202).getEmail());
	}

	@Test
	@DisplayName("Record 1203: Web is http://www.rosannegeneroso.com")
	void WebOfRecord1203() {
		assertEquals("http://www.rosannegeneroso.com", customers.get(1202).getWeb());
	}
}
