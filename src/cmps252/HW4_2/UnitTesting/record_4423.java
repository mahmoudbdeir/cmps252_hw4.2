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

@Tag("4")
class Record_4423 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4423: FirstName is Denice")
	void FirstNameOfRecord4423() {
		assertEquals("Denice", customers.get(4422).getFirstName());
	}

	@Test
	@DisplayName("Record 4423: LastName is Plantenberg")
	void LastNameOfRecord4423() {
		assertEquals("Plantenberg", customers.get(4422).getLastName());
	}

	@Test
	@DisplayName("Record 4423: Company is Oakwood Inn")
	void CompanyOfRecord4423() {
		assertEquals("Oakwood Inn", customers.get(4422).getCompany());
	}

	@Test
	@DisplayName("Record 4423: Address is 650 Broadway")
	void AddressOfRecord4423() {
		assertEquals("650 Broadway", customers.get(4422).getAddress());
	}

	@Test
	@DisplayName("Record 4423: City is Malden")
	void CityOfRecord4423() {
		assertEquals("Malden", customers.get(4422).getCity());
	}

	@Test
	@DisplayName("Record 4423: County is Middlesex")
	void CountyOfRecord4423() {
		assertEquals("Middlesex", customers.get(4422).getCounty());
	}

	@Test
	@DisplayName("Record 4423: State is MA")
	void StateOfRecord4423() {
		assertEquals("MA", customers.get(4422).getState());
	}

	@Test
	@DisplayName("Record 4423: ZIP is 2148")
	void ZIPOfRecord4423() {
		assertEquals("2148", customers.get(4422).getZIP());
	}

	@Test
	@DisplayName("Record 4423: Phone is 781-397-2145")
	void PhoneOfRecord4423() {
		assertEquals("781-397-2145", customers.get(4422).getPhone());
	}

	@Test
	@DisplayName("Record 4423: Fax is 781-397-5623")
	void FaxOfRecord4423() {
		assertEquals("781-397-5623", customers.get(4422).getFax());
	}

	@Test
	@DisplayName("Record 4423: Email is denice@plantenberg.com")
	void EmailOfRecord4423() {
		assertEquals("denice@plantenberg.com", customers.get(4422).getEmail());
	}

	@Test
	@DisplayName("Record 4423: Web is http://www.deniceplantenberg.com")
	void WebOfRecord4423() {
		assertEquals("http://www.deniceplantenberg.com", customers.get(4422).getWeb());
	}
}
