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

@Tag("29")
class Record_1796 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1796: FirstName is Antionette")
	void FirstNameOfRecord1796() {
		assertEquals("Antionette", customers.get(1795).getFirstName());
	}

	@Test
	@DisplayName("Record 1796: LastName is Geraldo")
	void LastNameOfRecord1796() {
		assertEquals("Geraldo", customers.get(1795).getLastName());
	}

	@Test
	@DisplayName("Record 1796: Company is Podvey Sachs Meanor Catenacci")
	void CompanyOfRecord1796() {
		assertEquals("Podvey Sachs Meanor Catenacci", customers.get(1795).getCompany());
	}

	@Test
	@DisplayName("Record 1796: Address is 623 W Liberty St")
	void AddressOfRecord1796() {
		assertEquals("623 W Liberty St", customers.get(1795).getAddress());
	}

	@Test
	@DisplayName("Record 1796: City is Medina")
	void CityOfRecord1796() {
		assertEquals("Medina", customers.get(1795).getCity());
	}

	@Test
	@DisplayName("Record 1796: County is Medina")
	void CountyOfRecord1796() {
		assertEquals("Medina", customers.get(1795).getCounty());
	}

	@Test
	@DisplayName("Record 1796: State is OH")
	void StateOfRecord1796() {
		assertEquals("OH", customers.get(1795).getState());
	}

	@Test
	@DisplayName("Record 1796: ZIP is 44256")
	void ZIPOfRecord1796() {
		assertEquals("44256", customers.get(1795).getZIP());
	}

	@Test
	@DisplayName("Record 1796: Phone is 330-725-7524")
	void PhoneOfRecord1796() {
		assertEquals("330-725-7524", customers.get(1795).getPhone());
	}

	@Test
	@DisplayName("Record 1796: Fax is 330-725-7604")
	void FaxOfRecord1796() {
		assertEquals("330-725-7604", customers.get(1795).getFax());
	}

	@Test
	@DisplayName("Record 1796: Email is antionette@geraldo.com")
	void EmailOfRecord1796() {
		assertEquals("antionette@geraldo.com", customers.get(1795).getEmail());
	}

	@Test
	@DisplayName("Record 1796: Web is http://www.antionettegeraldo.com")
	void WebOfRecord1796() {
		assertEquals("http://www.antionettegeraldo.com", customers.get(1795).getWeb());
	}
}
