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

@Tag("26")
class Record_1422 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1422: FirstName is Avery")
	void FirstNameOfRecord1422() {
		assertEquals("Avery", customers.get(1421).getFirstName());
	}

	@Test
	@DisplayName("Record 1422: LastName is Sissac")
	void LastNameOfRecord1422() {
		assertEquals("Sissac", customers.get(1421).getLastName());
	}

	@Test
	@DisplayName("Record 1422: Company is Gounley, Dennis J Esq")
	void CompanyOfRecord1422() {
		assertEquals("Gounley, Dennis J Esq", customers.get(1421).getCompany());
	}

	@Test
	@DisplayName("Record 1422: Address is 548 W 28th St")
	void AddressOfRecord1422() {
		assertEquals("548 W 28th St", customers.get(1421).getAddress());
	}

	@Test
	@DisplayName("Record 1422: City is New York")
	void CityOfRecord1422() {
		assertEquals("New York", customers.get(1421).getCity());
	}

	@Test
	@DisplayName("Record 1422: County is New York")
	void CountyOfRecord1422() {
		assertEquals("New York", customers.get(1421).getCounty());
	}

	@Test
	@DisplayName("Record 1422: State is NY")
	void StateOfRecord1422() {
		assertEquals("NY", customers.get(1421).getState());
	}

	@Test
	@DisplayName("Record 1422: ZIP is 10001")
	void ZIPOfRecord1422() {
		assertEquals("10001", customers.get(1421).getZIP());
	}

	@Test
	@DisplayName("Record 1422: Phone is 212-971-0647")
	void PhoneOfRecord1422() {
		assertEquals("212-971-0647", customers.get(1421).getPhone());
	}

	@Test
	@DisplayName("Record 1422: Fax is 212-971-2893")
	void FaxOfRecord1422() {
		assertEquals("212-971-2893", customers.get(1421).getFax());
	}

	@Test
	@DisplayName("Record 1422: Email is avery@sissac.com")
	void EmailOfRecord1422() {
		assertEquals("avery@sissac.com", customers.get(1421).getEmail());
	}

	@Test
	@DisplayName("Record 1422: Web is http://www.averysissac.com")
	void WebOfRecord1422() {
		assertEquals("http://www.averysissac.com", customers.get(1421).getWeb());
	}
}
