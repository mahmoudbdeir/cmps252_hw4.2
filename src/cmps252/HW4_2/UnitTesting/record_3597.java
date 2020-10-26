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

@Tag("21")
class Record_3597 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3597: FirstName is Esteban")
	void FirstNameOfRecord3597() {
		assertEquals("Esteban", customers.get(3596).getFirstName());
	}

	@Test
	@DisplayName("Record 3597: LastName is Madeja")
	void LastNameOfRecord3597() {
		assertEquals("Madeja", customers.get(3596).getLastName());
	}

	@Test
	@DisplayName("Record 3597: Company is Carlsons Dock St Seafood")
	void CompanyOfRecord3597() {
		assertEquals("Carlsons Dock St Seafood", customers.get(3596).getCompany());
	}

	@Test
	@DisplayName("Record 3597: Address is 153 Orchard St")
	void AddressOfRecord3597() {
		assertEquals("153 Orchard St", customers.get(3596).getAddress());
	}

	@Test
	@DisplayName("Record 3597: City is East Rutherford")
	void CityOfRecord3597() {
		assertEquals("East Rutherford", customers.get(3596).getCity());
	}

	@Test
	@DisplayName("Record 3597: County is Bergen")
	void CountyOfRecord3597() {
		assertEquals("Bergen", customers.get(3596).getCounty());
	}

	@Test
	@DisplayName("Record 3597: State is NJ")
	void StateOfRecord3597() {
		assertEquals("NJ", customers.get(3596).getState());
	}

	@Test
	@DisplayName("Record 3597: ZIP is 7073")
	void ZIPOfRecord3597() {
		assertEquals("7073", customers.get(3596).getZIP());
	}

	@Test
	@DisplayName("Record 3597: Phone is 201-804-4673")
	void PhoneOfRecord3597() {
		assertEquals("201-804-4673", customers.get(3596).getPhone());
	}

	@Test
	@DisplayName("Record 3597: Fax is 201-804-1789")
	void FaxOfRecord3597() {
		assertEquals("201-804-1789", customers.get(3596).getFax());
	}

	@Test
	@DisplayName("Record 3597: Email is esteban@madeja.com")
	void EmailOfRecord3597() {
		assertEquals("esteban@madeja.com", customers.get(3596).getEmail());
	}

	@Test
	@DisplayName("Record 3597: Web is http://www.estebanmadeja.com")
	void WebOfRecord3597() {
		assertEquals("http://www.estebanmadeja.com", customers.get(3596).getWeb());
	}
}
