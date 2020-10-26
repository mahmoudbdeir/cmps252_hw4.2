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

@Tag("22")
class Record_2300 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2300: FirstName is Wilfredo")
	void FirstNameOfRecord2300() {
		assertEquals("Wilfredo", customers.get(2299).getFirstName());
	}

	@Test
	@DisplayName("Record 2300: LastName is Polycarpe")
	void LastNameOfRecord2300() {
		assertEquals("Polycarpe", customers.get(2299).getLastName());
	}

	@Test
	@DisplayName("Record 2300: Company is Keuffel & Esser Co")
	void CompanyOfRecord2300() {
		assertEquals("Keuffel & Esser Co", customers.get(2299).getCompany());
	}

	@Test
	@DisplayName("Record 2300: Address is 2520 Sardis Rd Nd  #-220")
	void AddressOfRecord2300() {
		assertEquals("2520 Sardis Rd Nd  #-220", customers.get(2299).getAddress());
	}

	@Test
	@DisplayName("Record 2300: City is Charlotte")
	void CityOfRecord2300() {
		assertEquals("Charlotte", customers.get(2299).getCity());
	}

	@Test
	@DisplayName("Record 2300: County is Mecklenburg")
	void CountyOfRecord2300() {
		assertEquals("Mecklenburg", customers.get(2299).getCounty());
	}

	@Test
	@DisplayName("Record 2300: State is NC")
	void StateOfRecord2300() {
		assertEquals("NC", customers.get(2299).getState());
	}

	@Test
	@DisplayName("Record 2300: ZIP is 28227")
	void ZIPOfRecord2300() {
		assertEquals("28227", customers.get(2299).getZIP());
	}

	@Test
	@DisplayName("Record 2300: Phone is 704-568-5124")
	void PhoneOfRecord2300() {
		assertEquals("704-568-5124", customers.get(2299).getPhone());
	}

	@Test
	@DisplayName("Record 2300: Fax is 704-568-9942")
	void FaxOfRecord2300() {
		assertEquals("704-568-9942", customers.get(2299).getFax());
	}

	@Test
	@DisplayName("Record 2300: Email is wilfredo@polycarpe.com")
	void EmailOfRecord2300() {
		assertEquals("wilfredo@polycarpe.com", customers.get(2299).getEmail());
	}

	@Test
	@DisplayName("Record 2300: Web is http://www.wilfredopolycarpe.com")
	void WebOfRecord2300() {
		assertEquals("http://www.wilfredopolycarpe.com", customers.get(2299).getWeb());
	}
}
