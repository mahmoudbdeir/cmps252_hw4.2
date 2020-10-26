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
class Record_3570 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3570: FirstName is Donny")
	void FirstNameOfRecord3570() {
		assertEquals("Donny", customers.get(3569).getFirstName());
	}

	@Test
	@DisplayName("Record 3570: LastName is Tuer")
	void LastNameOfRecord3570() {
		assertEquals("Tuer", customers.get(3569).getLastName());
	}

	@Test
	@DisplayName("Record 3570: Company is Hoffman, Robert A Esq")
	void CompanyOfRecord3570() {
		assertEquals("Hoffman, Robert A Esq", customers.get(3569).getCompany());
	}

	@Test
	@DisplayName("Record 3570: Address is 2400 Harrison Rd")
	void AddressOfRecord3570() {
		assertEquals("2400 Harrison Rd", customers.get(3569).getAddress());
	}

	@Test
	@DisplayName("Record 3570: City is Columbus")
	void CityOfRecord3570() {
		assertEquals("Columbus", customers.get(3569).getCity());
	}

	@Test
	@DisplayName("Record 3570: County is Franklin")
	void CountyOfRecord3570() {
		assertEquals("Franklin", customers.get(3569).getCounty());
	}

	@Test
	@DisplayName("Record 3570: State is OH")
	void StateOfRecord3570() {
		assertEquals("OH", customers.get(3569).getState());
	}

	@Test
	@DisplayName("Record 3570: ZIP is 43204")
	void ZIPOfRecord3570() {
		assertEquals("43204", customers.get(3569).getZIP());
	}

	@Test
	@DisplayName("Record 3570: Phone is 614-272-0397")
	void PhoneOfRecord3570() {
		assertEquals("614-272-0397", customers.get(3569).getPhone());
	}

	@Test
	@DisplayName("Record 3570: Fax is 614-272-1454")
	void FaxOfRecord3570() {
		assertEquals("614-272-1454", customers.get(3569).getFax());
	}

	@Test
	@DisplayName("Record 3570: Email is donny@tuer.com")
	void EmailOfRecord3570() {
		assertEquals("donny@tuer.com", customers.get(3569).getEmail());
	}

	@Test
	@DisplayName("Record 3570: Web is http://www.donnytuer.com")
	void WebOfRecord3570() {
		assertEquals("http://www.donnytuer.com", customers.get(3569).getWeb());
	}
}
