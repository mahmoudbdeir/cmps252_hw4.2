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

@Tag("0")
class Record_3768 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3768: FirstName is Leanna")
	void FirstNameOfRecord3768() {
		assertEquals("Leanna", customers.get(3767).getFirstName());
	}

	@Test
	@DisplayName("Record 3768: LastName is Sandberg")
	void LastNameOfRecord3768() {
		assertEquals("Sandberg", customers.get(3767).getLastName());
	}

	@Test
	@DisplayName("Record 3768: Company is Sconyers, Alison A Esq")
	void CompanyOfRecord3768() {
		assertEquals("Sconyers, Alison A Esq", customers.get(3767).getCompany());
	}

	@Test
	@DisplayName("Record 3768: Address is 304 S Magnolia Ave")
	void AddressOfRecord3768() {
		assertEquals("304 S Magnolia Ave", customers.get(3767).getAddress());
	}

	@Test
	@DisplayName("Record 3768: City is Ocala")
	void CityOfRecord3768() {
		assertEquals("Ocala", customers.get(3767).getCity());
	}

	@Test
	@DisplayName("Record 3768: County is Marion")
	void CountyOfRecord3768() {
		assertEquals("Marion", customers.get(3767).getCounty());
	}

	@Test
	@DisplayName("Record 3768: State is FL")
	void StateOfRecord3768() {
		assertEquals("FL", customers.get(3767).getState());
	}

	@Test
	@DisplayName("Record 3768: ZIP is 34474")
	void ZIPOfRecord3768() {
		assertEquals("34474", customers.get(3767).getZIP());
	}

	@Test
	@DisplayName("Record 3768: Phone is 352-351-5873")
	void PhoneOfRecord3768() {
		assertEquals("352-351-5873", customers.get(3767).getPhone());
	}

	@Test
	@DisplayName("Record 3768: Fax is 352-351-1526")
	void FaxOfRecord3768() {
		assertEquals("352-351-1526", customers.get(3767).getFax());
	}

	@Test
	@DisplayName("Record 3768: Email is leanna@sandberg.com")
	void EmailOfRecord3768() {
		assertEquals("leanna@sandberg.com", customers.get(3767).getEmail());
	}

	@Test
	@DisplayName("Record 3768: Web is http://www.leannasandberg.com")
	void WebOfRecord3768() {
		assertEquals("http://www.leannasandberg.com", customers.get(3767).getWeb());
	}
}
