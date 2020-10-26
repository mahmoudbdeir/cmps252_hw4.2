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
class Record_2082 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2082: FirstName is Penelope")
	void FirstNameOfRecord2082() {
		assertEquals("Penelope", customers.get(2081).getFirstName());
	}

	@Test
	@DisplayName("Record 2082: LastName is Reposa")
	void LastNameOfRecord2082() {
		assertEquals("Reposa", customers.get(2081).getLastName());
	}

	@Test
	@DisplayName("Record 2082: Company is Macht, Jane Esq")
	void CompanyOfRecord2082() {
		assertEquals("Macht, Jane Esq", customers.get(2081).getCompany());
	}

	@Test
	@DisplayName("Record 2082: Address is 42050 Executive Dr")
	void AddressOfRecord2082() {
		assertEquals("42050 Executive Dr", customers.get(2081).getAddress());
	}

	@Test
	@DisplayName("Record 2082: City is Harrison Township")
	void CityOfRecord2082() {
		assertEquals("Harrison Township", customers.get(2081).getCity());
	}

	@Test
	@DisplayName("Record 2082: County is Macomb")
	void CountyOfRecord2082() {
		assertEquals("Macomb", customers.get(2081).getCounty());
	}

	@Test
	@DisplayName("Record 2082: State is MI")
	void StateOfRecord2082() {
		assertEquals("MI", customers.get(2081).getState());
	}

	@Test
	@DisplayName("Record 2082: ZIP is 48045")
	void ZIPOfRecord2082() {
		assertEquals("48045", customers.get(2081).getZIP());
	}

	@Test
	@DisplayName("Record 2082: Phone is 586-463-6704")
	void PhoneOfRecord2082() {
		assertEquals("586-463-6704", customers.get(2081).getPhone());
	}

	@Test
	@DisplayName("Record 2082: Fax is 586-463-2379")
	void FaxOfRecord2082() {
		assertEquals("586-463-2379", customers.get(2081).getFax());
	}

	@Test
	@DisplayName("Record 2082: Email is penelope@reposa.com")
	void EmailOfRecord2082() {
		assertEquals("penelope@reposa.com", customers.get(2081).getEmail());
	}

	@Test
	@DisplayName("Record 2082: Web is http://www.penelopereposa.com")
	void WebOfRecord2082() {
		assertEquals("http://www.penelopereposa.com", customers.get(2081).getWeb());
	}
}
