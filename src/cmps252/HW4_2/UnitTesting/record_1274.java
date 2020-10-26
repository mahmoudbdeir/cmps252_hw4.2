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

@Tag("12")
class Record_1274 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1274: FirstName is Alberto")
	void FirstNameOfRecord1274() {
		assertEquals("Alberto", customers.get(1273).getFirstName());
	}

	@Test
	@DisplayName("Record 1274: LastName is Surguy")
	void LastNameOfRecord1274() {
		assertEquals("Surguy", customers.get(1273).getLastName());
	}

	@Test
	@DisplayName("Record 1274: Company is Rudie, Jonathan B Esq")
	void CompanyOfRecord1274() {
		assertEquals("Rudie, Jonathan B Esq", customers.get(1273).getCompany());
	}

	@Test
	@DisplayName("Record 1274: Address is 55 1st Ave")
	void AddressOfRecord1274() {
		assertEquals("55 1st Ave", customers.get(1273).getAddress());
	}

	@Test
	@DisplayName("Record 1274: City is New York")
	void CityOfRecord1274() {
		assertEquals("New York", customers.get(1273).getCity());
	}

	@Test
	@DisplayName("Record 1274: County is New York")
	void CountyOfRecord1274() {
		assertEquals("New York", customers.get(1273).getCounty());
	}

	@Test
	@DisplayName("Record 1274: State is NY")
	void StateOfRecord1274() {
		assertEquals("NY", customers.get(1273).getState());
	}

	@Test
	@DisplayName("Record 1274: ZIP is 10003")
	void ZIPOfRecord1274() {
		assertEquals("10003", customers.get(1273).getZIP());
	}

	@Test
	@DisplayName("Record 1274: Phone is 212-254-3007")
	void PhoneOfRecord1274() {
		assertEquals("212-254-3007", customers.get(1273).getPhone());
	}

	@Test
	@DisplayName("Record 1274: Fax is 212-254-1643")
	void FaxOfRecord1274() {
		assertEquals("212-254-1643", customers.get(1273).getFax());
	}

	@Test
	@DisplayName("Record 1274: Email is alberto@surguy.com")
	void EmailOfRecord1274() {
		assertEquals("alberto@surguy.com", customers.get(1273).getEmail());
	}

	@Test
	@DisplayName("Record 1274: Web is http://www.albertosurguy.com")
	void WebOfRecord1274() {
		assertEquals("http://www.albertosurguy.com", customers.get(1273).getWeb());
	}
}
