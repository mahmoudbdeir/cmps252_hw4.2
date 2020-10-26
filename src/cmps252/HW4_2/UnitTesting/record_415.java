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

@Tag("14")
class Record_415 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 415: FirstName is Franklin")
	void FirstNameOfRecord415() {
		assertEquals("Franklin", customers.get(414).getFirstName());
	}

	@Test
	@DisplayName("Record 415: LastName is Schuman")
	void LastNameOfRecord415() {
		assertEquals("Schuman", customers.get(414).getLastName());
	}

	@Test
	@DisplayName("Record 415: Company is Waterman, David L Esq")
	void CompanyOfRecord415() {
		assertEquals("Waterman, David L Esq", customers.get(414).getCompany());
	}

	@Test
	@DisplayName("Record 415: Address is 345 S Prospect St")
	void AddressOfRecord415() {
		assertEquals("345 S Prospect St", customers.get(414).getAddress());
	}

	@Test
	@DisplayName("Record 415: City is Ypsilanti")
	void CityOfRecord415() {
		assertEquals("Ypsilanti", customers.get(414).getCity());
	}

	@Test
	@DisplayName("Record 415: County is Washtenaw")
	void CountyOfRecord415() {
		assertEquals("Washtenaw", customers.get(414).getCounty());
	}

	@Test
	@DisplayName("Record 415: State is MI")
	void StateOfRecord415() {
		assertEquals("MI", customers.get(414).getState());
	}

	@Test
	@DisplayName("Record 415: ZIP is 48198")
	void ZIPOfRecord415() {
		assertEquals("48198", customers.get(414).getZIP());
	}

	@Test
	@DisplayName("Record 415: Phone is 734-485-3871")
	void PhoneOfRecord415() {
		assertEquals("734-485-3871", customers.get(414).getPhone());
	}

	@Test
	@DisplayName("Record 415: Fax is 734-485-9959")
	void FaxOfRecord415() {
		assertEquals("734-485-9959", customers.get(414).getFax());
	}

	@Test
	@DisplayName("Record 415: Email is franklin@schuman.com")
	void EmailOfRecord415() {
		assertEquals("franklin@schuman.com", customers.get(414).getEmail());
	}

	@Test
	@DisplayName("Record 415: Web is http://www.franklinschuman.com")
	void WebOfRecord415() {
		assertEquals("http://www.franklinschuman.com", customers.get(414).getWeb());
	}
}
