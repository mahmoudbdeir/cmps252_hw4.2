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

@Tag("47")
class Record_2203 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2203: FirstName is Royce")
	void FirstNameOfRecord2203() {
		assertEquals("Royce", customers.get(2202).getFirstName());
	}

	@Test
	@DisplayName("Record 2203: LastName is Mcgavin")
	void LastNameOfRecord2203() {
		assertEquals("Mcgavin", customers.get(2202).getLastName());
	}

	@Test
	@DisplayName("Record 2203: Company is Moore & Bucher Pc")
	void CompanyOfRecord2203() {
		assertEquals("Moore & Bucher Pc", customers.get(2202).getCompany());
	}

	@Test
	@DisplayName("Record 2203: Address is 182 Mission Ave")
	void AddressOfRecord2203() {
		assertEquals("182 Mission Ave", customers.get(2202).getAddress());
	}

	@Test
	@DisplayName("Record 2203: City is San Rafael")
	void CityOfRecord2203() {
		assertEquals("San Rafael", customers.get(2202).getCity());
	}

	@Test
	@DisplayName("Record 2203: County is Marin")
	void CountyOfRecord2203() {
		assertEquals("Marin", customers.get(2202).getCounty());
	}

	@Test
	@DisplayName("Record 2203: State is CA")
	void StateOfRecord2203() {
		assertEquals("CA", customers.get(2202).getState());
	}

	@Test
	@DisplayName("Record 2203: ZIP is 94901")
	void ZIPOfRecord2203() {
		assertEquals("94901", customers.get(2202).getZIP());
	}

	@Test
	@DisplayName("Record 2203: Phone is 415-499-0783")
	void PhoneOfRecord2203() {
		assertEquals("415-499-0783", customers.get(2202).getPhone());
	}

	@Test
	@DisplayName("Record 2203: Fax is 415-499-4451")
	void FaxOfRecord2203() {
		assertEquals("415-499-4451", customers.get(2202).getFax());
	}

	@Test
	@DisplayName("Record 2203: Email is royce@mcgavin.com")
	void EmailOfRecord2203() {
		assertEquals("royce@mcgavin.com", customers.get(2202).getEmail());
	}

	@Test
	@DisplayName("Record 2203: Web is http://www.roycemcgavin.com")
	void WebOfRecord2203() {
		assertEquals("http://www.roycemcgavin.com", customers.get(2202).getWeb());
	}
}
