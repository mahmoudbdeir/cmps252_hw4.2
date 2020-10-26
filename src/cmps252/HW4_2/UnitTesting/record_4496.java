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

@Tag("40")
class Record_4496 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4496: FirstName is Eugenia")
	void FirstNameOfRecord4496() {
		assertEquals("Eugenia", customers.get(4495).getFirstName());
	}

	@Test
	@DisplayName("Record 4496: LastName is Senti")
	void LastNameOfRecord4496() {
		assertEquals("Senti", customers.get(4495).getLastName());
	}

	@Test
	@DisplayName("Record 4496: Company is Cianflone & Cianflone Pc")
	void CompanyOfRecord4496() {
		assertEquals("Cianflone & Cianflone Pc", customers.get(4495).getCompany());
	}

	@Test
	@DisplayName("Record 4496: Address is 616 Hawthorne St")
	void AddressOfRecord4496() {
		assertEquals("616 Hawthorne St", customers.get(4495).getAddress());
	}

	@Test
	@DisplayName("Record 4496: City is Alexandria")
	void CityOfRecord4496() {
		assertEquals("Alexandria", customers.get(4495).getCity());
	}

	@Test
	@DisplayName("Record 4496: County is Douglas")
	void CountyOfRecord4496() {
		assertEquals("Douglas", customers.get(4495).getCounty());
	}

	@Test
	@DisplayName("Record 4496: State is MN")
	void StateOfRecord4496() {
		assertEquals("MN", customers.get(4495).getState());
	}

	@Test
	@DisplayName("Record 4496: ZIP is 56308")
	void ZIPOfRecord4496() {
		assertEquals("56308", customers.get(4495).getZIP());
	}

	@Test
	@DisplayName("Record 4496: Phone is 320-762-3600")
	void PhoneOfRecord4496() {
		assertEquals("320-762-3600", customers.get(4495).getPhone());
	}

	@Test
	@DisplayName("Record 4496: Fax is 320-762-6799")
	void FaxOfRecord4496() {
		assertEquals("320-762-6799", customers.get(4495).getFax());
	}

	@Test
	@DisplayName("Record 4496: Email is eugenia@senti.com")
	void EmailOfRecord4496() {
		assertEquals("eugenia@senti.com", customers.get(4495).getEmail());
	}

	@Test
	@DisplayName("Record 4496: Web is http://www.eugeniasenti.com")
	void WebOfRecord4496() {
		assertEquals("http://www.eugeniasenti.com", customers.get(4495).getWeb());
	}
}
