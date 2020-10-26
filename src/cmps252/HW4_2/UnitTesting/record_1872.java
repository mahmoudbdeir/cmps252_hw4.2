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

@Tag("35")
class Record_1872 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1872: FirstName is Eloise")
	void FirstNameOfRecord1872() {
		assertEquals("Eloise", customers.get(1871).getFirstName());
	}

	@Test
	@DisplayName("Record 1872: LastName is Shukert")
	void LastNameOfRecord1872() {
		assertEquals("Shukert", customers.get(1871).getLastName());
	}

	@Test
	@DisplayName("Record 1872: Company is Garcia, Luis R Esq")
	void CompanyOfRecord1872() {
		assertEquals("Garcia, Luis R Esq", customers.get(1871).getCompany());
	}

	@Test
	@DisplayName("Record 1872: Address is 1150 Walker Mill Rd")
	void AddressOfRecord1872() {
		assertEquals("1150 Walker Mill Rd", customers.get(1871).getAddress());
	}

	@Test
	@DisplayName("Record 1872: City is Youngstown")
	void CityOfRecord1872() {
		assertEquals("Youngstown", customers.get(1871).getCity());
	}

	@Test
	@DisplayName("Record 1872: County is Mahoning")
	void CountyOfRecord1872() {
		assertEquals("Mahoning", customers.get(1871).getCounty());
	}

	@Test
	@DisplayName("Record 1872: State is OH")
	void StateOfRecord1872() {
		assertEquals("OH", customers.get(1871).getState());
	}

	@Test
	@DisplayName("Record 1872: ZIP is 44514")
	void ZIPOfRecord1872() {
		assertEquals("44514", customers.get(1871).getZIP());
	}

	@Test
	@DisplayName("Record 1872: Phone is 330-758-2498")
	void PhoneOfRecord1872() {
		assertEquals("330-758-2498", customers.get(1871).getPhone());
	}

	@Test
	@DisplayName("Record 1872: Fax is 330-758-3582")
	void FaxOfRecord1872() {
		assertEquals("330-758-3582", customers.get(1871).getFax());
	}

	@Test
	@DisplayName("Record 1872: Email is eloise@shukert.com")
	void EmailOfRecord1872() {
		assertEquals("eloise@shukert.com", customers.get(1871).getEmail());
	}

	@Test
	@DisplayName("Record 1872: Web is http://www.eloiseshukert.com")
	void WebOfRecord1872() {
		assertEquals("http://www.eloiseshukert.com", customers.get(1871).getWeb());
	}
}
