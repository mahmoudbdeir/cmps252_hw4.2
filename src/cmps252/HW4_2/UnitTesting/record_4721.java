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

@Tag("36")
class Record_4721 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4721: FirstName is Katheryn")
	void FirstNameOfRecord4721() {
		assertEquals("Katheryn", customers.get(4720).getFirstName());
	}

	@Test
	@DisplayName("Record 4721: LastName is Elizarraras")
	void LastNameOfRecord4721() {
		assertEquals("Elizarraras", customers.get(4720).getLastName());
	}

	@Test
	@DisplayName("Record 4721: Company is Darlene Dempster Acctg Svc Inc")
	void CompanyOfRecord4721() {
		assertEquals("Darlene Dempster Acctg Svc Inc", customers.get(4720).getCompany());
	}

	@Test
	@DisplayName("Record 4721: Address is 17 S High St")
	void AddressOfRecord4721() {
		assertEquals("17 S High St", customers.get(4720).getAddress());
	}

	@Test
	@DisplayName("Record 4721: City is Columbus")
	void CityOfRecord4721() {
		assertEquals("Columbus", customers.get(4720).getCity());
	}

	@Test
	@DisplayName("Record 4721: County is Franklin")
	void CountyOfRecord4721() {
		assertEquals("Franklin", customers.get(4720).getCounty());
	}

	@Test
	@DisplayName("Record 4721: State is OH")
	void StateOfRecord4721() {
		assertEquals("OH", customers.get(4720).getState());
	}

	@Test
	@DisplayName("Record 4721: ZIP is 43215")
	void ZIPOfRecord4721() {
		assertEquals("43215", customers.get(4720).getZIP());
	}

	@Test
	@DisplayName("Record 4721: Phone is 614-221-5173")
	void PhoneOfRecord4721() {
		assertEquals("614-221-5173", customers.get(4720).getPhone());
	}

	@Test
	@DisplayName("Record 4721: Fax is 614-221-0455")
	void FaxOfRecord4721() {
		assertEquals("614-221-0455", customers.get(4720).getFax());
	}

	@Test
	@DisplayName("Record 4721: Email is katheryn@elizarraras.com")
	void EmailOfRecord4721() {
		assertEquals("katheryn@elizarraras.com", customers.get(4720).getEmail());
	}

	@Test
	@DisplayName("Record 4721: Web is http://www.katherynelizarraras.com")
	void WebOfRecord4721() {
		assertEquals("http://www.katherynelizarraras.com", customers.get(4720).getWeb());
	}
}
