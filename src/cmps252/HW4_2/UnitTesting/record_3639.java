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

@Tag("41")
class Record_3639 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3639: FirstName is Oren")
	void FirstNameOfRecord3639() {
		assertEquals("Oren", customers.get(3638).getFirstName());
	}

	@Test
	@DisplayName("Record 3639: LastName is Opteyndt")
	void LastNameOfRecord3639() {
		assertEquals("Opteyndt", customers.get(3638).getLastName());
	}

	@Test
	@DisplayName("Record 3639: Company is Ingalls, Kenneth F Esq")
	void CompanyOfRecord3639() {
		assertEquals("Ingalls, Kenneth F Esq", customers.get(3638).getCompany());
	}

	@Test
	@DisplayName("Record 3639: Address is Panorama")
	void AddressOfRecord3639() {
		assertEquals("Panorama", customers.get(3638).getAddress());
	}

	@Test
	@DisplayName("Record 3639: City is Rochester")
	void CityOfRecord3639() {
		assertEquals("Rochester", customers.get(3638).getCity());
	}

	@Test
	@DisplayName("Record 3639: County is Monroe")
	void CountyOfRecord3639() {
		assertEquals("Monroe", customers.get(3638).getCounty());
	}

	@Test
	@DisplayName("Record 3639: State is NY")
	void StateOfRecord3639() {
		assertEquals("NY", customers.get(3638).getState());
	}

	@Test
	@DisplayName("Record 3639: ZIP is 14625")
	void ZIPOfRecord3639() {
		assertEquals("14625", customers.get(3638).getZIP());
	}

	@Test
	@DisplayName("Record 3639: Phone is 585-865-5311")
	void PhoneOfRecord3639() {
		assertEquals("585-865-5311", customers.get(3638).getPhone());
	}

	@Test
	@DisplayName("Record 3639: Fax is 585-865-4808")
	void FaxOfRecord3639() {
		assertEquals("585-865-4808", customers.get(3638).getFax());
	}

	@Test
	@DisplayName("Record 3639: Email is oren@opteyndt.com")
	void EmailOfRecord3639() {
		assertEquals("oren@opteyndt.com", customers.get(3638).getEmail());
	}

	@Test
	@DisplayName("Record 3639: Web is http://www.orenopteyndt.com")
	void WebOfRecord3639() {
		assertEquals("http://www.orenopteyndt.com", customers.get(3638).getWeb());
	}
}
