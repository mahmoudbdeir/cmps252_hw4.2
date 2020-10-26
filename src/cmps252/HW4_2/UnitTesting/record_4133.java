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
class Record_4133 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4133: FirstName is Kelly")
	void FirstNameOfRecord4133() {
		assertEquals("Kelly", customers.get(4132).getFirstName());
	}

	@Test
	@DisplayName("Record 4133: LastName is Mcgunnis")
	void LastNameOfRecord4133() {
		assertEquals("Mcgunnis", customers.get(4132).getLastName());
	}

	@Test
	@DisplayName("Record 4133: Company is Cravey, V Lynn Esq")
	void CompanyOfRecord4133() {
		assertEquals("Cravey, V Lynn Esq", customers.get(4132).getCompany());
	}

	@Test
	@DisplayName("Record 4133: Address is 3715 Scofield Carleton Rd")
	void AddressOfRecord4133() {
		assertEquals("3715 Scofield Carleton Rd", customers.get(4132).getAddress());
	}

	@Test
	@DisplayName("Record 4133: City is Carleton")
	void CityOfRecord4133() {
		assertEquals("Carleton", customers.get(4132).getCity());
	}

	@Test
	@DisplayName("Record 4133: County is Monroe")
	void CountyOfRecord4133() {
		assertEquals("Monroe", customers.get(4132).getCounty());
	}

	@Test
	@DisplayName("Record 4133: State is MI")
	void StateOfRecord4133() {
		assertEquals("MI", customers.get(4132).getState());
	}

	@Test
	@DisplayName("Record 4133: ZIP is 48117")
	void ZIPOfRecord4133() {
		assertEquals("48117", customers.get(4132).getZIP());
	}

	@Test
	@DisplayName("Record 4133: Phone is 734-654-6334")
	void PhoneOfRecord4133() {
		assertEquals("734-654-6334", customers.get(4132).getPhone());
	}

	@Test
	@DisplayName("Record 4133: Fax is 734-654-6319")
	void FaxOfRecord4133() {
		assertEquals("734-654-6319", customers.get(4132).getFax());
	}

	@Test
	@DisplayName("Record 4133: Email is kelly@mcgunnis.com")
	void EmailOfRecord4133() {
		assertEquals("kelly@mcgunnis.com", customers.get(4132).getEmail());
	}

	@Test
	@DisplayName("Record 4133: Web is http://www.kellymcgunnis.com")
	void WebOfRecord4133() {
		assertEquals("http://www.kellymcgunnis.com", customers.get(4132).getWeb());
	}
}
