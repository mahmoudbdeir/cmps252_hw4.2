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

@Tag("31")
class Record_3972 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3972: FirstName is Dwain")
	void FirstNameOfRecord3972() {
		assertEquals("Dwain", customers.get(3971).getFirstName());
	}

	@Test
	@DisplayName("Record 3972: LastName is Bartee")
	void LastNameOfRecord3972() {
		assertEquals("Bartee", customers.get(3971).getLastName());
	}

	@Test
	@DisplayName("Record 3972: Company is Thermosurgery Technologies Inc")
	void CompanyOfRecord3972() {
		assertEquals("Thermosurgery Technologies Inc", customers.get(3971).getCompany());
	}

	@Test
	@DisplayName("Record 3972: Address is 3509 S Peoria Ave")
	void AddressOfRecord3972() {
		assertEquals("3509 S Peoria Ave", customers.get(3971).getAddress());
	}

	@Test
	@DisplayName("Record 3972: City is Tulsa")
	void CityOfRecord3972() {
		assertEquals("Tulsa", customers.get(3971).getCity());
	}

	@Test
	@DisplayName("Record 3972: County is Tulsa")
	void CountyOfRecord3972() {
		assertEquals("Tulsa", customers.get(3971).getCounty());
	}

	@Test
	@DisplayName("Record 3972: State is OK")
	void StateOfRecord3972() {
		assertEquals("OK", customers.get(3971).getState());
	}

	@Test
	@DisplayName("Record 3972: ZIP is 74105")
	void ZIPOfRecord3972() {
		assertEquals("74105", customers.get(3971).getZIP());
	}

	@Test
	@DisplayName("Record 3972: Phone is 918-744-0395")
	void PhoneOfRecord3972() {
		assertEquals("918-744-0395", customers.get(3971).getPhone());
	}

	@Test
	@DisplayName("Record 3972: Fax is 918-744-8113")
	void FaxOfRecord3972() {
		assertEquals("918-744-8113", customers.get(3971).getFax());
	}

	@Test
	@DisplayName("Record 3972: Email is dwain@bartee.com")
	void EmailOfRecord3972() {
		assertEquals("dwain@bartee.com", customers.get(3971).getEmail());
	}

	@Test
	@DisplayName("Record 3972: Web is http://www.dwainbartee.com")
	void WebOfRecord3972() {
		assertEquals("http://www.dwainbartee.com", customers.get(3971).getWeb());
	}
}
