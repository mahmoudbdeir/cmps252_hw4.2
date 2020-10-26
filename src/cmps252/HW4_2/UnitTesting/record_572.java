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

@Tag("3")
class Record_572 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 572: FirstName is Ezekiel")
	void FirstNameOfRecord572() {
		assertEquals("Ezekiel", customers.get(571).getFirstName());
	}

	@Test
	@DisplayName("Record 572: LastName is Hedegore")
	void LastNameOfRecord572() {
		assertEquals("Hedegore", customers.get(571).getLastName());
	}

	@Test
	@DisplayName("Record 572: Company is Natl Schl Supl & Equip Assn")
	void CompanyOfRecord572() {
		assertEquals("Natl Schl Supl & Equip Assn", customers.get(571).getCompany());
	}

	@Test
	@DisplayName("Record 572: Address is 5829 Maspeth Ave")
	void AddressOfRecord572() {
		assertEquals("5829 Maspeth Ave", customers.get(571).getAddress());
	}

	@Test
	@DisplayName("Record 572: City is Maspeth")
	void CityOfRecord572() {
		assertEquals("Maspeth", customers.get(571).getCity());
	}

	@Test
	@DisplayName("Record 572: County is Queens")
	void CountyOfRecord572() {
		assertEquals("Queens", customers.get(571).getCounty());
	}

	@Test
	@DisplayName("Record 572: State is NY")
	void StateOfRecord572() {
		assertEquals("NY", customers.get(571).getState());
	}

	@Test
	@DisplayName("Record 572: ZIP is 11378")
	void ZIPOfRecord572() {
		assertEquals("11378", customers.get(571).getZIP());
	}

	@Test
	@DisplayName("Record 572: Phone is 718-326-5630")
	void PhoneOfRecord572() {
		assertEquals("718-326-5630", customers.get(571).getPhone());
	}

	@Test
	@DisplayName("Record 572: Fax is 718-326-2514")
	void FaxOfRecord572() {
		assertEquals("718-326-2514", customers.get(571).getFax());
	}

	@Test
	@DisplayName("Record 572: Email is ezekiel@hedegore.com")
	void EmailOfRecord572() {
		assertEquals("ezekiel@hedegore.com", customers.get(571).getEmail());
	}

	@Test
	@DisplayName("Record 572: Web is http://www.ezekielhedegore.com")
	void WebOfRecord572() {
		assertEquals("http://www.ezekielhedegore.com", customers.get(571).getWeb());
	}
}
