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

@Tag("28")
class Record_2916 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2916: FirstName is Marguerite")
	void FirstNameOfRecord2916() {
		assertEquals("Marguerite", customers.get(2915).getFirstName());
	}

	@Test
	@DisplayName("Record 2916: LastName is Bires")
	void LastNameOfRecord2916() {
		assertEquals("Bires", customers.get(2915).getLastName());
	}

	@Test
	@DisplayName("Record 2916: Company is Master Locksmith Assoc Of Nj")
	void CompanyOfRecord2916() {
		assertEquals("Master Locksmith Assoc Of Nj", customers.get(2915).getCompany());
	}

	@Test
	@DisplayName("Record 2916: Address is 5 North St")
	void AddressOfRecord2916() {
		assertEquals("5 North St", customers.get(2915).getAddress());
	}

	@Test
	@DisplayName("Record 2916: City is Troy")
	void CityOfRecord2916() {
		assertEquals("Troy", customers.get(2915).getCity());
	}

	@Test
	@DisplayName("Record 2916: County is Rensselaer")
	void CountyOfRecord2916() {
		assertEquals("Rensselaer", customers.get(2915).getCounty());
	}

	@Test
	@DisplayName("Record 2916: State is NY")
	void StateOfRecord2916() {
		assertEquals("NY", customers.get(2915).getState());
	}

	@Test
	@DisplayName("Record 2916: ZIP is 12180")
	void ZIPOfRecord2916() {
		assertEquals("12180", customers.get(2915).getZIP());
	}

	@Test
	@DisplayName("Record 2916: Phone is 518-271-3855")
	void PhoneOfRecord2916() {
		assertEquals("518-271-3855", customers.get(2915).getPhone());
	}

	@Test
	@DisplayName("Record 2916: Fax is 518-271-7124")
	void FaxOfRecord2916() {
		assertEquals("518-271-7124", customers.get(2915).getFax());
	}

	@Test
	@DisplayName("Record 2916: Email is marguerite@bires.com")
	void EmailOfRecord2916() {
		assertEquals("marguerite@bires.com", customers.get(2915).getEmail());
	}

	@Test
	@DisplayName("Record 2916: Web is http://www.margueritebires.com")
	void WebOfRecord2916() {
		assertEquals("http://www.margueritebires.com", customers.get(2915).getWeb());
	}
}
