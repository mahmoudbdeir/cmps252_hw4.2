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

@Tag("1")
class Record_1062 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1062: FirstName is Bettye")
	void FirstNameOfRecord1062() {
		assertEquals("Bettye", customers.get(1061).getFirstName());
	}

	@Test
	@DisplayName("Record 1062: LastName is Friede")
	void LastNameOfRecord1062() {
		assertEquals("Friede", customers.get(1061).getLastName());
	}

	@Test
	@DisplayName("Record 1062: Company is Ranco Teccor Electronics")
	void CompanyOfRecord1062() {
		assertEquals("Ranco Teccor Electronics", customers.get(1061).getCompany());
	}

	@Test
	@DisplayName("Record 1062: Address is 535 N Mich Ave")
	void AddressOfRecord1062() {
		assertEquals("535 N Mich Ave", customers.get(1061).getAddress());
	}

	@Test
	@DisplayName("Record 1062: City is Chicago")
	void CityOfRecord1062() {
		assertEquals("Chicago", customers.get(1061).getCity());
	}

	@Test
	@DisplayName("Record 1062: County is Cook")
	void CountyOfRecord1062() {
		assertEquals("Cook", customers.get(1061).getCounty());
	}

	@Test
	@DisplayName("Record 1062: State is IL")
	void StateOfRecord1062() {
		assertEquals("IL", customers.get(1061).getState());
	}

	@Test
	@DisplayName("Record 1062: ZIP is 60611")
	void ZIPOfRecord1062() {
		assertEquals("60611", customers.get(1061).getZIP());
	}

	@Test
	@DisplayName("Record 1062: Phone is 312-329-2771")
	void PhoneOfRecord1062() {
		assertEquals("312-329-2771", customers.get(1061).getPhone());
	}

	@Test
	@DisplayName("Record 1062: Fax is 312-329-0932")
	void FaxOfRecord1062() {
		assertEquals("312-329-0932", customers.get(1061).getFax());
	}

	@Test
	@DisplayName("Record 1062: Email is bettye@friede.com")
	void EmailOfRecord1062() {
		assertEquals("bettye@friede.com", customers.get(1061).getEmail());
	}

	@Test
	@DisplayName("Record 1062: Web is http://www.bettyefriede.com")
	void WebOfRecord1062() {
		assertEquals("http://www.bettyefriede.com", customers.get(1061).getWeb());
	}
}
