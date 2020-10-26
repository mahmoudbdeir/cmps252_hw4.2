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

@Tag("1")
class Record_684 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 684: FirstName is Jacquelyn")
	void FirstNameOfRecord684() {
		assertEquals("Jacquelyn", customers.get(683).getFirstName());
	}

	@Test
	@DisplayName("Record 684: LastName is Geoffroy")
	void LastNameOfRecord684() {
		assertEquals("Geoffroy", customers.get(683).getLastName());
	}

	@Test
	@DisplayName("Record 684: Company is Champaign County Chmbr Commrce")
	void CompanyOfRecord684() {
		assertEquals("Champaign County Chmbr Commrce", customers.get(683).getCompany());
	}

	@Test
	@DisplayName("Record 684: Address is 732 N 16th St")
	void AddressOfRecord684() {
		assertEquals("732 N 16th St", customers.get(683).getAddress());
	}

	@Test
	@DisplayName("Record 684: City is Allentown")
	void CityOfRecord684() {
		assertEquals("Allentown", customers.get(683).getCity());
	}

	@Test
	@DisplayName("Record 684: County is Lehigh")
	void CountyOfRecord684() {
		assertEquals("Lehigh", customers.get(683).getCounty());
	}

	@Test
	@DisplayName("Record 684: State is PA")
	void StateOfRecord684() {
		assertEquals("PA", customers.get(683).getState());
	}

	@Test
	@DisplayName("Record 684: ZIP is 18102")
	void ZIPOfRecord684() {
		assertEquals("18102", customers.get(683).getZIP());
	}

	@Test
	@DisplayName("Record 684: Phone is 610-437-2056")
	void PhoneOfRecord684() {
		assertEquals("610-437-2056", customers.get(683).getPhone());
	}

	@Test
	@DisplayName("Record 684: Fax is 610-437-3298")
	void FaxOfRecord684() {
		assertEquals("610-437-3298", customers.get(683).getFax());
	}

	@Test
	@DisplayName("Record 684: Email is jacquelyn@geoffroy.com")
	void EmailOfRecord684() {
		assertEquals("jacquelyn@geoffroy.com", customers.get(683).getEmail());
	}

	@Test
	@DisplayName("Record 684: Web is http://www.jacquelyngeoffroy.com")
	void WebOfRecord684() {
		assertEquals("http://www.jacquelyngeoffroy.com", customers.get(683).getWeb());
	}
}
