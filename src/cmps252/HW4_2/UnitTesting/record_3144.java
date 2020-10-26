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
class Record_3144 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3144: FirstName is Daryl")
	void FirstNameOfRecord3144() {
		assertEquals("Daryl", customers.get(3143).getFirstName());
	}

	@Test
	@DisplayName("Record 3144: LastName is Iulo")
	void LastNameOfRecord3144() {
		assertEquals("Iulo", customers.get(3143).getLastName());
	}

	@Test
	@DisplayName("Record 3144: Company is beamer, Thomas M Esq")
	void CompanyOfRecord3144() {
		assertEquals("beamer, Thomas M Esq", customers.get(3143).getCompany());
	}

	@Test
	@DisplayName("Record 3144: Address is 72 Center St")
	void AddressOfRecord3144() {
		assertEquals("72 Center St", customers.get(3143).getAddress());
	}

	@Test
	@DisplayName("Record 3144: City is Brewer")
	void CityOfRecord3144() {
		assertEquals("Brewer", customers.get(3143).getCity());
	}

	@Test
	@DisplayName("Record 3144: County is Penobscot")
	void CountyOfRecord3144() {
		assertEquals("Penobscot", customers.get(3143).getCounty());
	}

	@Test
	@DisplayName("Record 3144: State is ME")
	void StateOfRecord3144() {
		assertEquals("ME", customers.get(3143).getState());
	}

	@Test
	@DisplayName("Record 3144: ZIP is 4412")
	void ZIPOfRecord3144() {
		assertEquals("4412", customers.get(3143).getZIP());
	}

	@Test
	@DisplayName("Record 3144: Phone is 207-989-1389")
	void PhoneOfRecord3144() {
		assertEquals("207-989-1389", customers.get(3143).getPhone());
	}

	@Test
	@DisplayName("Record 3144: Fax is 207-989-9505")
	void FaxOfRecord3144() {
		assertEquals("207-989-9505", customers.get(3143).getFax());
	}

	@Test
	@DisplayName("Record 3144: Email is daryl@iulo.com")
	void EmailOfRecord3144() {
		assertEquals("daryl@iulo.com", customers.get(3143).getEmail());
	}

	@Test
	@DisplayName("Record 3144: Web is http://www.daryliulo.com")
	void WebOfRecord3144() {
		assertEquals("http://www.daryliulo.com", customers.get(3143).getWeb());
	}
}
