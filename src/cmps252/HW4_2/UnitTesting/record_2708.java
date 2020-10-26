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

@Tag("13")
class Record_2708 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2708: FirstName is Lina")
	void FirstNameOfRecord2708() {
		assertEquals("Lina", customers.get(2707).getFirstName());
	}

	@Test
	@DisplayName("Record 2708: LastName is Beucler")
	void LastNameOfRecord2708() {
		assertEquals("Beucler", customers.get(2707).getLastName());
	}

	@Test
	@DisplayName("Record 2708: Company is Allen, Debra J Esq")
	void CompanyOfRecord2708() {
		assertEquals("Allen, Debra J Esq", customers.get(2707).getCompany());
	}

	@Test
	@DisplayName("Record 2708: Address is 100 Fernwood Ave")
	void AddressOfRecord2708() {
		assertEquals("100 Fernwood Ave", customers.get(2707).getAddress());
	}

	@Test
	@DisplayName("Record 2708: City is Rochester")
	void CityOfRecord2708() {
		assertEquals("Rochester", customers.get(2707).getCity());
	}

	@Test
	@DisplayName("Record 2708: County is Monroe")
	void CountyOfRecord2708() {
		assertEquals("Monroe", customers.get(2707).getCounty());
	}

	@Test
	@DisplayName("Record 2708: State is NY")
	void StateOfRecord2708() {
		assertEquals("NY", customers.get(2707).getState());
	}

	@Test
	@DisplayName("Record 2708: ZIP is 14621")
	void ZIPOfRecord2708() {
		assertEquals("14621", customers.get(2707).getZIP());
	}

	@Test
	@DisplayName("Record 2708: Phone is 585-544-6513")
	void PhoneOfRecord2708() {
		assertEquals("585-544-6513", customers.get(2707).getPhone());
	}

	@Test
	@DisplayName("Record 2708: Fax is 585-544-3843")
	void FaxOfRecord2708() {
		assertEquals("585-544-3843", customers.get(2707).getFax());
	}

	@Test
	@DisplayName("Record 2708: Email is lina@beucler.com")
	void EmailOfRecord2708() {
		assertEquals("lina@beucler.com", customers.get(2707).getEmail());
	}

	@Test
	@DisplayName("Record 2708: Web is http://www.linabeucler.com")
	void WebOfRecord2708() {
		assertEquals("http://www.linabeucler.com", customers.get(2707).getWeb());
	}
}
