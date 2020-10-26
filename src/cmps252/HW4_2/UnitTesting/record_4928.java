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

@Tag("5")
class Record_4928 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4928: FirstName is Carlo")
	void FirstNameOfRecord4928() {
		assertEquals("Carlo", customers.get(4927).getFirstName());
	}

	@Test
	@DisplayName("Record 4928: LastName is Thyng")
	void LastNameOfRecord4928() {
		assertEquals("Thyng", customers.get(4927).getLastName());
	}

	@Test
	@DisplayName("Record 4928: Company is Pool & Spa Center")
	void CompanyOfRecord4928() {
		assertEquals("Pool & Spa Center", customers.get(4927).getCompany());
	}

	@Test
	@DisplayName("Record 4928: Address is 80 E State Rt 4")
	void AddressOfRecord4928() {
		assertEquals("80 E State Rt 4", customers.get(4927).getAddress());
	}

	@Test
	@DisplayName("Record 4928: City is Paramus")
	void CityOfRecord4928() {
		assertEquals("Paramus", customers.get(4927).getCity());
	}

	@Test
	@DisplayName("Record 4928: County is Bergen")
	void CountyOfRecord4928() {
		assertEquals("Bergen", customers.get(4927).getCounty());
	}

	@Test
	@DisplayName("Record 4928: State is NJ")
	void StateOfRecord4928() {
		assertEquals("NJ", customers.get(4927).getState());
	}

	@Test
	@DisplayName("Record 4928: ZIP is 7652")
	void ZIPOfRecord4928() {
		assertEquals("7652", customers.get(4927).getZIP());
	}

	@Test
	@DisplayName("Record 4928: Phone is 201-843-1947")
	void PhoneOfRecord4928() {
		assertEquals("201-843-1947", customers.get(4927).getPhone());
	}

	@Test
	@DisplayName("Record 4928: Fax is 201-843-1888")
	void FaxOfRecord4928() {
		assertEquals("201-843-1888", customers.get(4927).getFax());
	}

	@Test
	@DisplayName("Record 4928: Email is carlo@thyng.com")
	void EmailOfRecord4928() {
		assertEquals("carlo@thyng.com", customers.get(4927).getEmail());
	}

	@Test
	@DisplayName("Record 4928: Web is http://www.carlothyng.com")
	void WebOfRecord4928() {
		assertEquals("http://www.carlothyng.com", customers.get(4927).getWeb());
	}
}
